USE AdventureWorks2008R2

/* 3. Select a list of FirstName and LastName for employees where Title is one of Design Engineer, Tool Designer or Marketing 
Assistant. (Schema(s) involved: HumanResources, Person)
*/

SELECT Person.Person.FirstName , Person.Person.LastName, HumanResources.Employee.JobTitle
FROM Person.Person Join HumanResources.Employee ON Person.Person.BusinessEntityID=HumanResources.Employee.BusinessEntityID
AND HumanResources.Employee.JobTitle IN ('Design Engineer','Tool Designer','Marketing Assistant');

