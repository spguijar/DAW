--EJERCICIO_01________________________________________
--Crea el tipo de objetos "Personal"

--borrado del objeto en el caso de que exista
drop type Personal force;

--Creación del objeto Personal
create or replace TYPE Personal AS OBJECT (
  codigo INTEGER,
	dni VARCHAR2(10),
	nombre VARCHAR2(30),
	apellidos VARCHAR2(30),
	sexo VARCHAR2(1),
	fecha_nac DATE
)NOT FINAL;
/

--borrado del objeto en el caso de que exista
drop type Responsable force;

--Crea, como tipo heredado de "Personal", el tipo de objeto "Responsable" 
create or replace TYPE Responsable UNDER Personal (
tipo  CHAR ,
antiguedad INTEGER,
CONSTRUCTOR FUNCTION Responsable(codigo INTEGER,nombre VARCHAR2,primer_apellido VARCHAR2,
segundo_apellido VARCHAR2,tipo  CHAR) 
RETURN SELF AS RESULT,

--Crea un método getNombreCompleto ejercicio 03
MEMBER FUNCTION getNombreCompleto RETURN VARCHAR2

);
/

--borrado del objeto en el caso de que exista
drop type Zonas force;
--Crea el tipo de objeto "Zonas" 
create or replace TYPE Zonas AS OBJECT (
	 codigo INTEGER, 
	nombre VARCHAR2(20), 
	refRespon REF Responsable, 
	codigoPostal CHAR(5),
	MAP MEMBER FUNCTION ordenarZonas RETURN VARCHAR2
);
/

--borrado del objeto en el caso de que exista
drop type Comercial force;

--Crea, como tipo heredado de "Personal", el tipo de objeto "Comercial" 
create or replace TYPE Comercial UNDER Personal (
zonaComercial Zonas
);

--EJERCICIO_02________________________________________


CREATE OR REPLACE TYPE BODY Responsable AS


CONSTRUCTOR FUNCTION Responsable(codigo INTEGER,nombre VARCHAR2,primer_apellido VARCHAR2,
segundo_apellido VARCHAR2,tipo  CHAR) 
RETURN SELF AS RESULT AS

    BEGIN
		SELF.codigo:=codigo;
		SELF.nombre:=nombre;
        SELF.apellidos := primer_apellido||' ' ||segundo_apellido;
		SELF.tipo :=tipo;
	RETURN;
        
    END;
	--EJERCICIO 03_________________________________
	MEMBER FUNCTION getNombreCompleto RETURN VARCHAR2
	IS

	apellidos_nombre VARCHAR2(60);
	BEGIN

	apellidos_nombre:=SELF.apellidos||' '||SELF.nombre;
	RETURN(apellidos_nombre);
	END getNombreCompleto;

	END Responsable;


--EJERCICIO_04________________________________________


drop table TablaResponsables;
CREATE TABLE TablaResponsables  OF Responsable;
/
DECLARE
r1 Responsable;
r2 Responsable;


BEGIN
r1 := NEW Responsable(5,'51083099F','ELENA','POSTA LLANOS','F','31/03/1975','N','4');
r2 := NEW Responsable(6,'JAVIER','JARAMILLO','HERNANDEZ','C');


INSERT INTO TablaResponsables VALUES (r1);
INSERT INTO TablaResponsables VALUES (r2);
END;
select * from TablaResponsables


--EJERCICIO_06________________________________________
--Crea una tabla TablaComerciales de objetos Comercial. Inserta en dicha tabla las siguientes filas:
DROP TABLE TablaComerciales;
CREATE TABLE TablaComerciales OF Comercial;


--EJERCICIO_05________________________________________
--Crea una colección VARRAY llamada ListaZonas en la que
--se puedan almacenar hasta 10 objetos Zonas. Guarda en una instancia listaZonas1 de dicha lista, dos Zonas

CREATE OR REPLACE TYPE ListaZonas AS
VARRAY(10) OF zonas;

/

CREATE TABLE TablaComerciales OF Comercial;
DECLARE
listaZonas1 ListaZonas;
Zona1 Zonas;
Zona2 Zonas;
respon REF Responsable;
unComercial  Comercial; 


BEGIN
    Select REF(p) INTO respon  from TablaResponsables p where p.codigo=5;
    Zona1:= new Zonas(1,'zona 1',respon,'06834');
    Select REF (p) INTO respon from TablaResponsables p where p.dni='51083099F';
    Zona2:= new Zonas(2,'zona 2',respon,'28003');
    listaZonas1:=ListaZonas(Zona1,Zona2);
	
	--Ejercicio 06, insertar filas
	INSERT INTO TablaComerciales VALUES(Comercial(100,'23401092Z','MARCOS','SUAREZ LOPEZ','M','30/3/1990',listaZonas1(1)));


	INSERT INTO TablaComerciales VALUES(Comercial(102,'6932288V','ANASTASIA','GOMES PEREZ','F','28/11/1984',listaZonas1(2)));
	
	--ejercicio 07
	
    select value (a) into unComercial  from TablaComerciales a where a.codigo=100;
    
    --ejercicio 08
	uncomercial.codigo := 101;
	uncomercial.zonaComercial:=listaZonas1(2);

	INSERT INTO TablaComerciales VALUES (unComercial);
	
END;



--EJERCICIO_09________________________________________
--Crea un método MAP ordenarZonas para el tipo Zonas. Este método debe retornar el nombre completo del Responsable al que hace referencia cada zona.
-- Para obtener el nombre debes utilizar el método getNombreCompleto que se ha creado anteriormente

CREATE OR REPLACE TYPE BODY COMERCIAL AS
	MAP MEMBER FUNCTION ordenarZonas RETURN VARCHAR2 IS
	respon Responsable;
	BEGIN
        SELECT DEREF(refRespon) INTO respon FROM DUAL;
        RETURN respon.getNombreCompleto();
	END;
END;


--EJERCICIO_10________________________________________
--Realiza una consulta de la tabla TablaComerciales ordenada 
--por zonaComercial para comprobar el funcionamiento del método MAP. 
SELECT * FROM TablaComerciales ORDER BY zonaComercial;
