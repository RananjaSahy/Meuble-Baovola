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
    nom varchar(50) unique
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
    idstyle idcategorie int references style(idstyle)
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