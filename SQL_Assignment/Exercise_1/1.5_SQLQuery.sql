USE AdventureWorks2008R2

/*
5. Display Description and MaxQty fields from the SpecialOffer table. Some of the MaxQty values are NULL, in this case display 
the value 0.00 instead. (Schema(s) involved: Sales)
*/

SELECT Description,
	   COALESCE(MaxQty,0.00) AS 'MAXIMUM Quantity'
FROM Sales.SpecialOffer;