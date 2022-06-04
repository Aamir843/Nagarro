USE AdventureWorks2008R2

--4. Display the Name and Color of the Product with the maximum weight. (Schema(s) involved: Production)SELECT Production.Product.Name, Production.Product.Color FROM Production.Product WHERE Production.Product.Weight=(SELECT MAX(Production.Product.Weight) FROM Production.Product)