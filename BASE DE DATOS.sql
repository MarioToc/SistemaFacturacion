CREATE TABLE usuarios(
  idusuario int primary key,
  nombre varchar(200),
  apellido varchar(200),
  usuario varchar(50),
  contrasena varchar(50)
);

INSERT INTO usuarios values(1,'Mario','Toc','Saloj','12345');
INSERT INTO usuarios values(2,'Julio','Perez','perez','11111');
INSERT INTO usuarios values(3,'Super','Administrador','a','a');

CREATE TABLE clientes(
  idcliente INT primary key,
  nit varchar(50),
  nombre varchar(100),
  apellido varchar(100),
  direccion varchar(200),
  telefono varchar(15),
  email varchar(200)
);

INSERT INTO clientes values(1,'CF','Consumidor','Final','Ciudad','77613443','consumidor@final.com');
INSERT INTO clientes values(2,'123','Maria','Gonzales','San Pedro La Laguna','77615454','maria76@gmail.com');
INSERT INTO clientes values(3,'456','Mario','Toc','Barrio San Bartolo, Solola','77620087','mario@hotmail.com');


CREATE TABLE categorias(
  idcategoria INT primary key,
  nombre varchar(200),
  descripcion varchar(200)
);

INSERT INTO categorias values(100,'Bebidas','Pepsi, Coca-cola, grapete y Otros');
INSERT INTO categorias values(101,'Granos Basico','Frijol Negro, Frijol Blanco, Azucar, Cafe');
INSERT INTO categorias values(102,'Lacteos','Leche, Yogurt, Queso');

CREATE TABLE productos(
  idproducto INT primary key,
  idcategoria int,
  nombre varchar(200),
  costo decimal(10,2),
  precio decimal(10,2),  
  stock int,
  FOREIGN KEY (idcategoria) REFERENCES categorias (idcategoria)
);

INSERT INTO productos values(1000,100,'Pepsi Light',5.00,7.00,100);
INSERT INTO productos values(1001,100,'Coca Cola',4.00,5.00,100);
INSERT INTO productos values(1002,101,'Frijol Chaparrita',8.00,10.00,50);
INSERT INTO productos values(1003,101,'Cafe Don Quique',15.00,17.00,50);
INSERT INTO productos values(1004,102,'Yogurt Light Durazno',3.00,5.00,20);
INSERT INTO productos values(1005,102,'Leche descremada',10.00,12.00,20);

CREATE TABLE facturas(
  idfactura int primary key,
  idcliente int,
  fecha date,
  FOREIGN KEY (idcliente) REFERENCES clientes (idcliente)
);

INSERT INTO facturas values(1,1,TO_DATE('2016-10-20', 'yyyy/mm/dd'));
INSERT INTO facturas values(2,1,TO_DATE('2016-10-21', 'yyyy/mm/dd'));
INSERT INTO facturas values(3,3,TO_DATE('2016-10-24', 'yyyy/mm/dd'));

INSERT INTO facturas values(4,2,TO_DATE('2016-10-24', 'yyyy/mm/dd'));
INSERT INTO facturas values(5,2,TO_DATE('2016-10-25', 'yyyy/mm/dd'));
INSERT INTO facturas values(6,3,TO_DATE('2016-10-25', 'yyyy/mm/dd'));

INSERT INTO facturas values(7,1,TO_DATE('2016-10-26', 'yyyy/mm/dd'));
INSERT INTO facturas values(8,3,TO_DATE('2016-10-26', 'yyyy/mm/dd'));
INSERT INTO facturas values(9,3,TO_DATE('2016-10-26', 'yyyy/mm/dd'));
INSERT INTO facturas values(10,3,TO_DATE('2016-10-27', 'yyyy/mm/dd'));


CREATE TABLE facturas_detalle(
  idfactura int ,
  idlinea int,
  idproducto int,
  cantidad int,
  precio decimal(12,2),
  primary key(idfactura,idlinea),
  FOREIGN KEY (idproducto) REFERENCES productos (idproducto)
);

INSERT INTO facturas_detalle values(1,1,1000,2,7.00);
INSERT INTO facturas_detalle values(1,2,1001,2,5.00);
INSERT INTO facturas_detalle values(1,3,1004,4,12.00);
INSERT INTO facturas_detalle values(2,1,1002,1,10.00);
INSERT INTO facturas_detalle values(2,2,1003,1,17.00);
INSERT INTO facturas_detalle values(3,1,1005,1,12.00);

INSERT INTO facturas_detalle values(4,1,1002,1,10.00);
INSERT INTO facturas_detalle values(5,1,1002,1,10.00);
INSERT INTO facturas_detalle values(5,2,1003,1,17.00);
INSERT INTO facturas_detalle values(6,1,1005,1,12.00);

INSERT INTO facturas_detalle values(7,1,1002,1,10.00);
INSERT INTO facturas_detalle values(8,1,1000,2,7.00);
INSERT INTO facturas_detalle values(9,1,1002,1,10.00);
INSERT INTO facturas_detalle values(10,1,1000,2,7.00);
INSERT INTO facturas_detalle values(10,2,1001,5,5.00);
INSERT INTO facturas_detalle values(10,3,1004,5,5.00);




