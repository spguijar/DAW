--SCRIPT de creación de tablas de TIENDA

--Creación tabla FAMILIA ->Contiene las familias a las que pertenecen los productos, 
--como por ejemplo ordenadores, impresoras,etc.

CREATE TABLE FAMILIA (
Codfamilia VARCHAR(3) CONSTRAINT fa_cod_PK PRIMARY KEY,
Denofamilia VARCHAR(50)  CONSTRAINT fa_deno_UKNN UNIQUE NOT NULL);


--Creación tabla PRODUCTO ->contendrá información general sobre los productos
--que distribuye la empresa a las tiendas.
CREATE TABLE PRODUCTO (
Codproducto VARCHAR(5) CONSTRAINT pro_cod_PK PRIMARY KEY,
Denoproducto VARCHAR(20) CONSTRAINT pro_deno_NN NOT NULL, 
Descripcion  VARCHAR(100),
PrecioBase NUMBER(8,2) CONSTRAINT pro_precio_NN NOT NULL CHECK (PrecioBase>0),
PorcReposicion NUMBER(3) CHECK (PorcReposicion>0),
UnidadesMinimas NUMBER(4) CONSTRAINT pro_uni_NN NOT NULL CHECK (UnidadesMinimas>0),
Codfamilia varchar(3) CONSTRAINT PRO_cod_FK REFERENCES FAMILIA(CodFamilia));


--Creación tabla TIENDA: => contendrá información básica 
--sobre las tiendas que distribuyen los productos.
CREATE TABLE TIENDA(
Codtienda VARCHAR(3) CONSTRAINT tien_cod_PK PRIMARY KEY,
Denotienda VARCHAR(20) CONSTRAINT tien_deno_NN NOT NULL,
Telefono VARCHAR(11),
CodigoPostal VARCHAR(5) CONSTRAINT tien_codpos_NN NOT NULL,
Provincia VARCHAR(5) CONSTRAINT tiend_prov_NN NOT NULL);

--Creación tabla STOCK : => Contendrá, para cada tienda, el número de unidades disponibles de cada producto.
--La clave primaria está formada por la concatenación de los campos Codtienda y Codproducto
CREATE TABLE STOCK (
Codtienda VARCHAR(3) CONSTRAINT sto_codtiend_FK REFERENCES TIENDA(Codtienda),
Codproducto VARCHAR(5) CONSTRAINT sto_cod_FK REFERENCES PRODUCTO(Codproducto),
Unidades NUMBER(6,0) CONSTRAINT sto_uni_NNCK NOT NULL CHECK(Unidades>0),
CONSTRAINT sotck_cod_PK PRIMARY KEY(Codtienda, Codproducto));
