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
    nom varchar(50)
);

create table categorie(
    idcategorie serial primary key,
    nom varchar(50)
);

create table taille(
    idtaille serial primary key,
    idcategorie int references categorie(idcategorie),
    nom varchar(50),-- petite --moyenne --grande
    valeur int unique--permet de trier les tailles
);

create table style(
    idstyle serial primary key,
    nom varchar(50)
);

create table stylematiere(
    idstylematiere serial primary key,
    idstyle int references style(idstyle),
    idmatiere int references matiere(idmatiere)
);

