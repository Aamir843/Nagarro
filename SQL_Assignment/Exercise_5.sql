USE AdventureWorks2008R2

/*Exercise 5
Write a Procedure supplying name information from the Person.Person table and accepting a filter for the first name. Alter the above 
Store Procedure to supply Default Values if user does not enter any value. ( Use AdventureWorks)
*/

--PROCEDURE
GO
CREATE PROCEDURE Person.up_getNamesByType
	@Type nchar(2) = 'EM'
AS
SELECT FirstName FROM Person.Person WHERE PersonType = @Type
GO

--EXEC Person.up_getNamesByType @Type ='SC'