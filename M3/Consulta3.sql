select * from marca order by id_marca desc;
-- guardar nuevas marca
INSERT INTO MARCA (nombre) values ('omo');
INSERT INTO MARCA (id_marca, nombre) values (16, 'ariel');
INSERT INTO MARCA (id_marca, nombre) values (null, 'ace');


-- modificar información
update marca set nombre = 'Omo Matic' where id_marca = 15;
update marca set nombre = 'Ariel' where id_marca = 16;
update marca set nombre = 'Ace' where id_marca = 17;

-- eliminar fila
delete from marca where id_marca = 1; -- NO SE elimina lo ocupa tabla producto
delete from marca where id_marca = 15; -- si elimina 