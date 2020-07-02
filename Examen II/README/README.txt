Examen II
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


