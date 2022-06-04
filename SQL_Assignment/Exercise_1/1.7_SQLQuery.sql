USE AdventureWorks2008R2

/*
7. Display the FirstName and LastName of records from the Person table where FirstName contains the letters ‘ss’. Display an 
additional column with sequential numbers for each row returned beginning at integer 1. (Schema(s) involved: Person)
*/


SELECT ROW_NUMBER() OVER(ORDER BY FirstName) AS 'Sequence',
	   FirstName,
	   LastName
FROM Person.Person
WHERE FirstName LIKE '%ss%';