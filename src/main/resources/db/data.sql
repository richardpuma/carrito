INSERT INTO public.cliente
(apellidos, dni, email, nombres, telefono)
VALUES('pumapillo ccorahua', '47341348', 'richard@gmail.com', 'richard', '930284413');
INSERT INTO public.cliente
(apellidos, dni, email, nombres, telefono)
VALUES('carasas champi', '89341348', 'luiz@gmail.com', 'luiz', '942284413');
INSERT INTO public.cliente
(apellidos, dni, email, nombres, telefono)
VALUES('jimenez cova', '96341348', 'michell@gmail.com', 'michell', '978284413');
INSERT INTO public.cliente
(apellidos, dni, email, nombres, telefono)
VALUES('waldir mando', '63341348', 'paolo@gmail.com', 'paolo', '923284413');

INSERT INTO public.producto
(precio, nombre)
VALUES(45.00, 'Teclado');
INSERT INTO public.producto
(precio, nombre)
VALUES(250.00, 'Monitor');
INSERT INTO public.producto
(precio, nombre)
VALUES(50.50, 'Mouse');
INSERT INTO public.producto
(precio, nombre)
VALUES(850.50, 'Memoria RAM 4G');

INSERT INTO public.venta
(fecha, id_cliente)
VALUES('2023/06/26', 1);
INSERT INTO public.venta
(fecha, id_cliente)
VALUES('2023/07/02', 1);
INSERT INTO public.venta
(fecha, id_cliente)
VALUES('2023/07/06', 1);
INSERT INTO public.venta
(fecha, id_cliente)
VALUES('2023/07/01', 2);
INSERT INTO public.venta
(fecha, id_cliente)
VALUES('2023/07/01', 2);

INSERT INTO public.detalle_venta
(cantidad, id_producto, id_venta)
VALUES(2, 1, 1);
INSERT INTO public.detalle_venta
(cantidad, id_producto, id_venta)
VALUES(5, 2, 1);
INSERT INTO public.detalle_venta
(cantidad, id_producto, id_venta)
VALUES(12, 3, 1);
INSERT INTO public.detalle_venta
(cantidad, id_producto, id_venta)
VALUES(2, 1, 5);
INSERT INTO public.detalle_venta
(cantidad, id_producto, id_venta)
VALUES(3, 4, 5);
