--EJERCICIO 1________________________________________________________
--Creación de las tablas

drop table familias;
create table familias (
     identificador     number(6) not null primary key,
     nombre          varchar2(40) not null unique,
     familia          number(6) references familias,
     oficina          number(6) references oficinas
);
drop table agentes;
create table agentes (
     identificador     number(6) not null primary key,
     nombre          varchar2(60) not null,
     usuario          varchar2(20) not null unique,
     clave          varchar2(20) not null,
     habilidad     number(1) not null,
     categoria     number(1) not null,
     familia          number(6) references familias,
     oficina          number(6) references oficinas
);

--Inserccion de datos

insert into familias values (11, 'Madrid-1', NULL, 1);
insert into familias values (111, 'Madrid-1.1', 11, NULL);
insert into familias values (112, 'Madrid-1.2', 11, NULL);
insert into familias values (1121, 'Madrid-1.2.1', 112, NULL);
insert into familias values (1122, 'Madrid-1.2.2', 112, NULL);
insert into familias values (1123, 'Madrid-1.2.3', 112, NULL);
insert into familias values (21, 'Granada-1', NULL, 2);
insert into familias values (211, 'Granada-1.1', 21, NULL);
insert into familias values (212, 'Granada-1.2', 21, NULL);
insert into familias values (213, 'Granada-1.3', 21, NULL);
insert into familias values (31, 'Jaén-1', NULL, 3);

insert into agentes values (31, 'José Ramón Jiménez Reyes', 'jrjr', 'sup31', 9, 2, NULL, 3);
insert into agentes values (311, 'Pedro Fernández Arias', 'pfa', 'ag311', 5, 0, 31, NULL);
insert into agentes values (312, 'Vanesa Sánchez Rojo', 'vsr', 'ag312', 5, 0, 31, NULL);
insert into agentes values (313, 'Francisco Javier García Escobedo', 'fjge', 'ag313', 5, 0, 31, NULL);
insert into agentes values (314, 'Pilar Ramirez Pérez', 'prp', 'ag314', 5, 0, 31, NULL);
insert into agentes values (315, 'José Luis García Martínez', 'jlgm', 'ag315', 5, 0, 31, NULL);
insert into agentes values (21, 'Sebastián López Ojeda', 'slo', 'sup21', 9, 2, NULL, 2);
insert into agentes values (211, 'Diosdado Sánchez Hernández', 'dsh', 'ag211', 8, 1, 21, NULL);
insert into agentes values (2111, 'José Juan Cano Pardo', 'jjcp', 'ag2111', 5, 0, 211, NULL);
insert into agentes values (2112, 'Flor Moncada Añón', 'ag2112', 'fma', 5, 0, 211, NULL);
insert into agentes values (2113, 'Juan Manuel Alcazar Donaire', 'jmad', 'ag2113', 5, 0, 211, NULL);
insert into agentes values (2121, 'Manuel Jesús Rubia Mateos', 'mjrm', 'ag2121', 5, 0, 212, NULL);
insert into agentes values (2122, 'Esther López Delgado', 'eld', 'ag2122', 5, 0, 212, NULL);
insert into agentes values (2123, 'Francisco Javier Cabrerizo Membrilla', 'fjcm', 'ag2123', 5, 0, 212, NULL);
insert into agentes values (2124, 'Verónica Cabrerizo Menbrilla', 'vcm', 'ag2124', 5, 0, 212, NULL);
insert into agentes values (2125, 'María José Navascués Morales', 'mjnm', 'ag2125', 5, 0, 212, NULL);
insert into agentes values (2131, 'Isabel Cruz Granados', 'icg', 'ag2131', 5, 0, 213, NULL);
insert into agentes values (2132, 'Antonio Casado Fernández', 'acf', 'ag2132', 5, 0, 213, NULL);
insert into agentes values (2133, 'Gabriel Callejón García', 'gcg', 'ag2133', 5, 0, 213, NULL);
insert into agentes values (2134, 'Enrique Cano Balsera', 'ecb', 'ag2134', 5, 0, 213, NULL);
insert into agentes values (11, 'Narciso Jáimez Toro', 'njt', 'sup11', 9, 2, NULL, 1);
insert into agentes values (111, 'Jesús Baños Sancho', 'jbs', 'ag111', 8, 1, 11, NULL);
insert into agentes values (1111, 'Salvador Romero Villegas', 'srv', 'ag1111', 7, 1, 111, NULL);
insert into agentes values (1112, 'José Javier Bermúdez Hernández', 'jjbh', 'ag1112', 7, 1, 111, NULL);
insert into agentes values (1113, 'Alfonso Bonillo Sierra', 'abs', 'ag1113', 7, 1, 111, NULL);
insert into agentes values (1121, 'Silvia Thomas Barrós', 'stb', 'ag1121', 7, 1, 112, NULL);
insert into agentes values (11211, 'Ernesto Osoro Gorrotxategi', 'eog', 'ag11211', 5, 0, 1121, NULL);
insert into agentes values (11212, 'Guillermo Campos Guillén', 'gcag', 'ag11212', 5, 0, 1121, NULL);
insert into agentes values (11213, 'Antonio Fernández Ruíz', 'afr', 'ag11213', 5, 0, 1121, NULL);
insert into agentes values (11214, 'María Luisa López Caballero', 'mllc', 'ag11214', 5, 0, 1121, NULL);
insert into agentes values (11221, 'Virginia Morenas Rubio', 'vmr', 'ag11221', 5, 0, 1121, NULL);
insert into agentes values (11222, 'Rosario Castro García', 'rcg', 'ag11222', 5, 0, 1122, NULL);
insert into agentes values (11223, 'Antonio Álvarez Palomeque', 'aap', 'ag11223', 5, 0, 1122, NULL);
insert into agentes values (11224, 'David Martínez Martínez', 'dmm', 'ag11224', 5, 0, 1122, NULL);
insert into agentes values (11225, 'Juan Corral González', 'jcg', 'ag11225', 5, 0, 1122, NULL);
insert into agentes values (11226, 'Eduardo Alfada Pereira', 'eap', 'ag11226', 5, 0, 1122, NULL);
insert into agentes values (11231, 'Cayetano García Herrera', 'cgh', 'ag11231', 5, 0, 1123, NULL);
insert into agentes values (11232, 'José Antonio Sieres Vega', 'jasv', 'ag11232', 5, 0, 1123, NULL);
insert into agentes values (11233, 'Juan Manuel Guzmán García', 'jmgg', 'ag11233', 5, 0, 1123, NULL);




---EJERCICIO 01 PL/SQL 


SET SERVEROUTPUT ON  
--Creación de la función existe_familia

CREATE OR REPLACE FUNCTION existe_familia (
     id_familia NUMBER
     )
     RETURN NUMBER IS
     num_familias NUMBER;
     --devuelve 0 si NO tiene familia
     --devuelve 1 si SI tiene familia
     BEGIN
     
        SELECT count(*) INTO num_familias FROM FAMILIAS WHERE IDENTIFICADOR = id_familia;
        IF num_familias >0 then
        return 1; 
        else
        return 0;
        END if;
        
        
END existe_familia;
     
--Creación del procedimiento de cambiar familias

CREATE OR REPLACE PROCEDURE cambiar_familias(
    familia_origen NUMBER,
    familia_destino NUMBER)
    IS
    --CREACIÓN DE VARIABLES LOCALES
    familia_orig_ex NUMBER;
    familia_dest_ex NUMBER;
    num_agentes NUMBER;
    nombre_familiaOrigen familias.nombre%type;
    nombre_familiaDestino familias.nombre%type;
    EX_FamiliaIgual EXCEPTION;
    EX_nOExisteFamiliaOrigen EXCEPTION;
    EX_nOExisteFamiliaDestino EXCEPTION;
     
BEGIN
familia_orig_ex := EXISTE_FAMILIA(familia_origen);
familia_dest_ex := EXISTE_FAMILIA(familia_destino);

IF familia_origen = familia_destino THEN
    RAISE EX_FamiliaIgual;
ELSIF familia_orig_ex =0 THEN 
    RAISE EX_nOExisteFamiliaOrigen;
ELSIF familia_dest_ex =0 THEN
    RAISE EX_nOExisteFamiliaDestino;
ELSE 
    select nombre into nombre_familiaOrigen from familias where identificador=familia_origen;
    select nombre into nombre_familiaDestino from familias where identificador=familia_destino;
    select count(*)into num_agentes from agentes where familia= familia_origen;
    UPDATE agentes SET familia = familia_destino WHERE familia= familia_origen;
    
    dbms_output.put_line('Se han trasladado ' || TO_CHAR(num_agentes) || ' agentes de la familia '|| nombre_familiaOrigen ||' a la familia '|| nombre_familiaDestino);
    
end IF;
EXCEPTION
 WHEN EX_FamiliaIgual THEN
  dbms_output.put_line('FAMILIA ES IGUAL');
  WHEN EX_nOExisteFamiliaOrigen THEN
  dbms_output.put_line('NO EXISTE FAMILIA ORIGEN');
  WHEN EX_nOExisteFamiliaDestino THEN
  dbms_output.put_line('NO EXISTE FAMILIA DESTINO');
  
WHEN NO_DATA_FOUND THEN
 dbms_output.put_line('NO HA DEVUELTO NINGÚN DATO LA CONSULTA');
 
WHEN OTHERS THEN
  dbms_output.put_line('Error Oracle ' || TO_CHAR(SQLCODE) || 'Mensaje: ' || SQLERRM);
  
  
 
END cambiar_familias;

--Llamada al procedimiento

CALL cambiar_familias(11,1123)





--EJERCICIO 2________________________________________________________

--Creación de la tabla agentes con  restricciones
drop table agentes;

create table agentes (
     identificador     number(6) not null primary key,
     nombre          varchar2(60) not null,
     usuario          varchar2(20) not null unique,
     clave          varchar2(20) not null ,
     habilidad     number(1) not null CONSTRAINT agen_hab_CK CHECK (habilidad BETWEEN 0 AND 9), --Restricción 'a habilidad de un agente debe estar comprendida entre 0 y 9 (ambos inclusive).'
     categoria     number(1) not null CONSTRAINT agen_cat_CK CHECK(categoria IN (0,1,2)), -- Restricción 'La categoría de un agente sólo puede ser igual a 0, 1 o 2.'
     familia          number(6) references familias,
     oficina          number(6) references oficinas
);


--Creación del dispirador para incluir las restricciones de la tabla agentes
CREATE OR REPLACE TRIGGER restriccion_agentes
BEFORE INSERT OR UPDATE ON agentes
FOR EACH ROW
BEGIN
--Condicional 'La longitud de la clave de un agente no puede ser inferior a 6.'
IF LENGTH(:new.clave)<6 THEN
    RAISE_APPLICATION_ERROR(-20201,'La longitud de la clave de un agente no puede ser inferior a 6.');
--Condicional 'Si un agente tiene categoría 2 no puede pertenecer a ninguna familia y debe pertenecer a una oficina. '   
ELSIF (:new.categoria =2 and :new.familia IS NOT NULL) THEN
    RAISE_APPLICATION_ERROR(-20202,'Los agentes con categoria 2 no pueden pertenecer a ninguna familia');  
ELSIF(:new.categoria =2 and :new.oficina IS NULL) THEN
    RAISE_APPLICATION_ERROR(-20203,'Los agentes con categoria 2 tienen que pertenecer a una oficina');
	
--Condicional 'Si un agente tiene categoría 1 no puede pertenecer a ninguna oficina y debe pertenecer  a una familia. '	
ELSIF (:new.categoria =1 and :new.oficina IS NOT NULL) THEN
    RAISE_APPLICATION_ERROR(-20204,'Los agentes con categoria 1 no pueden pertenecer a ninguna oficina');  
ELSIF(:new.categoria =1 and :new.familia IS NULL) THEN
    RAISE_APPLICATION_ERROR(-20205,'Los agentes con categoria 2 tienen que pertenecer a una familia');
	
--Condicional 'Todos los agentes deben pertenecer  a una oficina o a una familia pero nunca a ambas a la vez.'	
ELSIF(:new.oficina IS NOT NULL and :new.familia IS NOT NULL )THEN
RAISE_APPLICATION_ERROR(-20206,'Los agentes no pueden pertenecer a una oficina y familia a la vez');

ELSIF(:new.oficina IS NULL and :new.familia IS NULL )THEN
RAISE_APPLICATION_ERROR(-20207,'Los agentes tienen que pertenecer a una oficina o a una familia');

END IF;
END;

    
--Comprobación de restricciones

--#La longitud de la clave de un agente no puede ser inferior a 6.
--Script ERROR
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria,familia)
VALUES (11233, 'Sandra Pérez', 'spg', '0',5,0,11);
--Script OK
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria,familia)
VALUES (11235, 'Sandra Pérez', 'spg', '0000000',5,0,11);
--#La habilidad de un agente debe estar comprendida entre 0 y 9 (ambos inclusive).
--Script ERROR
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria,familia)
VALUES (11236, 'Sandra Pérez', 'spg', '0000000',10,0,11);

--Script OK
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria,familia)
VALUES (11237, 'Sandra Pérez', 'spg_', '000_000',9,0,11);


--#La categoría de un agente sólo puede ser igual a 0, 1 o 2.
--Script ERROR
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria,familia)
VALUES (11238, 'Sandra Pérez', 'spg_1', '000_000',9,4,11);

--Script OK
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria,familia)
VALUES (11238, 'Sandra Pérez', 'spg_1', '000_000',9,1,11);


--#Si un agente tiene categoría 2 no puede pertenecer a ninguna familia y debe pertenecer a una oficina.  
--Script ERROR
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria,familia)
VALUES (112388, 'Sandra Pérez', 'spg_spg_88', '000_000',9,2,11);
--Script ERROR
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria)
VALUES (112388, 'Sandra Pérez', 'spg_spg_88', '000_000',9,2);
--Script OK
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria,oficina)
VALUES (112388, 'Sandra Pérez', 'spg_spg_88', '000_000',9,2,1);

--#Si un agente tiene categoría 1 no puede pertenecer a ninguna oficina y debe pertenecer  a una familia.
--Script ERROR
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria,oficina)
VALUES (112391, 'Sandra Pérez', 'spg_spg_91', '000_000',9,1,1);
--Script ERROR
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria)
VALUES (112391, 'Sandra Pérez', 'spg_spg_91', '000_000',9,1);
--Script OK
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria,familia)
VALUES (112394, 'Sandra Pérez', 'spg_spg_92', '000_0440',9,1,11);

--#Todos los agentes deben pertenecer  a una oficina o a una familia pero nunca a ambas a la vez.
--Script ERROR
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria)
VALUES (112395, 'Sandra Pérez', 'spg_spg_95', '000_0440',9,3);
--Script ERROR
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria,familia,oficina)
VALUES (112395, 'Sandra Pérez', 'spg_spg_95', '000_0440',9,3,11,1);
--Script OK
insert into agentes(identificador,nombre,usuario,clave,habilidad,categoria,familia)
VALUES (112396, 'Sandra Pérez', 'spg_spg_6', '000_0440',9,0,11);

    
 