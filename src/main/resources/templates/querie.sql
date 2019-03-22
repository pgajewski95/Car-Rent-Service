/*Rules*/
insert  into car_rental.role(role_id, role) values(1, 'ADMIN');
insert into car_rental.role(role_id, role) values (2, 'USER');

/*
Users
 */

 insert into car_rental.user (id, active, name, password)
 values (1, 1,'ADMIN','$2a$10$Q0U/VqvdNzhOCIhPxIE7vu3CkK5d9tjHwhR9QTSit24pMMwpGLNi.');

insert into car_rental.user (id, active, name, password)
values (2, 1,'USER','$2a$10$mycF2n0iOMtTU7hArCM.OOBS7CUHkvrHb5PikPpJpz4Ufimu4BmVe');

/*ADD ROLE TO USER*/

insert into car_rental.user_role (user_id, role_id)
values (1, 1);
insert into car_rental.user_role (user_id, role_id)
values (1, 2);

insert into solar_system.user_role (user_id, role_id)
values (2, 2);