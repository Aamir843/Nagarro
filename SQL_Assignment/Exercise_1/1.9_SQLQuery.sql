USE AdventureWorks2008R2

/*
9. Display the managerial hierarchy from Ruth Ellerbrock (person type – EM) up to CEO Ken Sanchez. Hint: use 
[uspGetEmployeeManagers] (Schema(s) involved: [Person], [HumanResources])
*/



DECLARE @ID int;
SELECT @ID = BusinessEntityID 
FROM Person.Person 
WHERE FirstName = 'Ruth' 
	AND LastName = 'Ellerbrock'
	AND PersonType = 'EM';
EXEC dbo.uspGetEmployeeManagers @BusinessEntityID = @ID;


