/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Sahy
 * Created: 9 janv. 2024
 */

insert into matiere values(default,'melamine',1000);
insert into matiere values(default,'or',10000);
insert into matiere values(default,'metal',3000);

insert into categorie values(default,'canape');
insert into categorie values(default,'chaise');

insert into volume values(default,'petit');
insert into volume values(default,'moyen');
insert into volume values(default,'grand');

insert into style values(default,'boheme');
insert into style values(default,'royal');

insert into stylematiere values(default,1,1);
insert into stylematiere values(default,1,3);
insert into stylematiere values(default,2,2);
insert into stylematiere values(default,2,3);

insert into meuble values(default,'sahy',1,1);
insert into meuble values(default,'sarobidy',1,1);

insert into quantitematiere values(default,1,1,1,3);
insert into quantitematiere values(default,1,1,3,1);
insert into quantitematiere values(default,1,2,1,5);
insert into quantitematiere values(default,1,2,3,3);
insert into quantitematiere values(default,2,1,2,5);
insert into quantitematiere values(default,2,1,3,2);
insert into quantitematiere values(default,2,2,2,8);
insert into quantitematiere values(default,2,2,3,5);

