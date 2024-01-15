/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Sahy
 * Created: 12 déc. 2023
 */

create database meuble;
\c meuble


create table matiere(
    idmatiere serial primary key,
    nom varchar(50) unique,
    prixunitaire double precision
);

create table categorie(
    idcategorie serial primary key,
    nom varchar(50) unique
);

create table volume(
    idvolume serial primary key,
    nom varchar(50) unique-- petite --moyenne --grande
);

create table style(
    idstyle serial primary key,
    nom varchar(50) unique
);

create table meuble(
    idmeuble serial primary key,
    nom varchar(50),
    idcategorie int references categorie(idcategorie),
    idstyle int references style(idstyle)
);

create table stylematiere(
    idstylematiere serial primary key,
    idstyle int references style(idstyle),
    idmatiere int references matiere(idmatiere)
);

create table quantitematiere(
    idquantitematiere serial primary key,
    idmeuble int references meuble(idmeuble),
    idvolume int references volume(idvolume),
    idmatiere int references matiere(idmatiere),
    quantite double precision
);

create table mouvementstock(
    idmouvementstock serial primary key,
    date date,
    idmatiere int references matiere(idmatiere),
    quantite double  precision,
    typemouvement int
);


create table fabrication(
    idfabrication serial primary key,
    date date,
    idmeuble int references meuble(idmeuble),
    idvolume int references volume(idvolume),
    quantite double precision
);


create or replace view v_quantitematiere as(
    select quantitematiere.*,meuble.nom as nommeuble,volume.nom as nomvolume,matiere.nom as nommatiere,matiere.prixunitaire, (matiere.prixunitaire*quantitematiere.quantite) as total from quantitematiere
    join meuble on meuble.idmeuble = quantitematiere.idmeuble
    join volume on volume.idvolume = quantitematiere.idvolume
    join matiere on matiere.idmatiere = quantitematiere.idmatiere
);

create or replace view meublevolume as(
    select idmeuble,nommeuble,idvolume,nomvolume,sum(total) as prixfabrication from v_quantitematiere group by idmeuble,idvolume,nommeuble,nomvolume order by idmeuble
);

create or replace view v_mouvementstock as(
    select mouvementstock.*,matiere.nom as nommatiere,matiere.prixunitaire from mouvementstock
    join matiere on mouvementstock.idmatiere = matiere.idmatiere
);

create or replace view v_fabrication as(
    select fabrication.*,meuble.nom as nommeuble, volume.nom as nomvolume from fabrication
    join meuble on fabrication.idmeuble = meuble.idmeuble
    join volume on fabrication.idvolume = volume.idvolume
);