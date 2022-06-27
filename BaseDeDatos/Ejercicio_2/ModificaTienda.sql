--SCRIPT de mofidicación de tablas de TIENDA

--Modificación tabla STOCK
ALTER TABLE STOCK ADD (
FechaUltimaEntrada DATE DEFAULT SYSDATE,
Beneficio NUMBER(1) CONSTRAINT sto_ben_CK CHECK (Beneficio BETWEEN 1 AND 5));

--Modificación tabla PRODUCTO
ALTER TABLE PRODUCTO DROP COLUMN Descripcion;
ALTER TABLE PRODUCTO ADD(
perecedero VARCHAR(1) CONSTRAINT pro_per_CK CHECK(perecedero IN ('S','N')));
ALTER TABLE PRODUCTO MODIFY Denoproducto VARCHAR(50);

--Modificación tabla FAMILIA

ALTER TABLE FAMILIA ADD(
IVA NUMBER(2) CONSTRAINT fam_iv_CK CHECK(IVA IN (4,10,21)));


--Modificación tabla TIENDA
ALTER TABLE TIENDA MODIFY CodigoPostal CONSTRAINT tiend_cod_UK UNIQUE;



--Modificacion nombre de la tabla STOCK

RENAME STOCK TO PRODXTIENDAS;

--Eliminar tabla FAMILIA


DROP TABLE FAMILIA CASCADE CONSTRAINTS;

--Crea un usuario llamado C##INVITADO siguiendo los pasos de la unidad 1 y dale todos los privilegios sobre la tabla PRODUCTO.

CREATE USER C##INVITADO IDENTIFIED BY admin;

GRANT ALL PRIVILEGES ON PRODUCTO TO C##INVITADO;

--Retira los permisos de modificar la estructura de la tabla y borrar contenido de la tabla PRODUCTO al usuario anterior.

REVOKE UPDATE,DELETE ON PRODUCTO FROM C##INVITADO;
DELETE FROM PRODUCTO







