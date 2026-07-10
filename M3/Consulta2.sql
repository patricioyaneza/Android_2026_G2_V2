select * from producto;

select p.id_producto as Id,
		p.nombre as Nombre,
        p.descripcion as Descripción,
        m.nombre AS Marca,
        c.nombre as Categoría,
        p.stock as Stock,
        p.precio as Precio,
        p.precio * 1.19 as "Precio de Venta"
from producto p
	inner join categoria c on c.id_categoria = p.id_categoria
	INNER JOIN marca m ON m.id_marca = p.id_marca;
;
    
-- Ejercicio 1: agregar la marca del producto    
-- Ejercicio 2: mostrar todas las facturas junto con los datos de los clientes 

select f.id_factura as "Nro Factura",
	f.fecha as Fecha,
    f.metodo_pago as "Método de pago",
	c.nombre as "Nombre Cliente",
	c.apellido as Apellido,
	c.telefono as Telefono,
	c.correo as Correo,
	c.direccion as Dirección
from  factura f
	inner join cliente c on c.id_cliente = f.id_factura
-- where f.id_cliente = 3
where lower(f.metodo_pago) = 'efectivo'
and f.id_cliente = 3
;