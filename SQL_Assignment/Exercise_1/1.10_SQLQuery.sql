USE AdventureWorks2008R2

/*
10. Display the ProductId of the product with the largest stock level. Hint: Use the Scalar-valued function [dbo]. [UfnGetStock]. 
(Schema(s) involved: Production)
*/


SELECT MAX(dbo.ufnGetStock(ProductID)) FROM Production.Product;