select * from categoria;
select * from PRODUCTO;
SELECT nombre from producto;
SELECT nombre, precio, stock  from producto;

select * from producto order by id_categoria;
select * from producto order by nombre;
select * from producto order by id_categoria, nombre desc;

select upper(nombre), lower(descripcion), length(nombre), precio, round(precio*1.1) from producto;
select upper(nombre) as Nombre, 
		lower(descripcion) Descripción, 
        length(nombre) as "cantidad caracteres", 
        precio, 
        round(precio*1.1) as "Precio Final"
from producto;

-- algunas funciones para estadísticas
select count(id_producto) from producto; -- contar las filas 
select sum(stock) from producto; -- sumar valores de una columna
select avg(precio) from producto; -- promediar valores de una columna
select min(stock) from producto; -- obtener el valor minimo
select max(stock) from producto; -- obtener el valor maximo
select * from producto order by stock desc;

select * from producto where id_categoria = 5;
select * from producto where id_producto >= 5;


-- Ejercicio 1: mostrar los 5 producto que tienen el mayor precio
select * from producto order by precio desc limit 5;
