Examen Parcial II
Wilmer José Mata Camacho
B54187

-------------------------------------------------------------
Parte Spring

Ejemplos utilizando Postman

------------------------------------------------------------

getAllMajors

Get | localhost:8080/getAllMajors | Send

------------------------------------------------------------

getMajorById

Get | localhost:8080/getMajorById?majorId=1 | Send

Key -> majorId
Value -> 1

-----------------------------------------------------------

addMajor

Post | localhost:8080/addMajor/ 

Body -> raw -> JSON 

{
    "name": "English Language and Literature",
    "semesters": 12
}

Send 

-----------------------------------------------------------

updateMajor 

Put | localhost:8080/updateMajor/

Body -> raw -> JSON 

{
    "majorId": 7,
    "name": "English Language",
    "semesters": 15
}

Send 

----------------------------------------------------------

deleteMajor

Delete | localhost:8080/deleteMajor?majorId=7

Key -> majorId 
Value -> 7

---------------------------------------------------------
Parte Angular | Proyecto de Lenguajes
---------------------------------------------------------

CRUD Course
---------------------------------------------------------

Listado de Cursos

Ubicado en pantalla de administrador

http://localhost:4200/admin-view

Sección de Cursos registrados

Tabla que contiene todos los cursos registrados previamente


---------------------------------------------------------

course-add

http://localhost:4200/course-add

Validaciones para inputs, muestra mensajes en rojo debajo de ellos.

--------------------------------------------------------------------

course-update

http://localhost:4200/course-update/2     <- el número es el id del curso

Los inputs se llenan con la información del curso que se desea actualizar.

Si los inputs están vacíos estos muestran las validaciones debajo de ellas.


Nota: En la pantalla de administrador, en la tabla de cursos se cuenta con una opción de
"Editar" pero esta no dirige a la vista para actualizarla, por lo que se debe realizar
a mano mediante la dirección que está indicada arriba. 
---------------------------------------------------------------------------

Eliminación de curso

Ubicado en pantalla de administrador, en la tabla que muestra el listado de cursos.

En las acciones de la tabla se encuentra la opción de "Borrar", con este se borra el curso.




