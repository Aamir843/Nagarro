USE AdventureWorks2008R2

/*
8.Sales people receive various commission rates that belong to 1 of 4 bands.
				(Schema(s) involved: Sales)
				CommissionPct	Commission Band
				0.00			Band 0
				Up To 1%		Band 1
				Up To 1.5%		Band 2
				Greater 1.5%	Band 3
				
				Display the [SalesPersonID] with an additional column entitled ‘Commission Band’ 
				indicating the appropriate band as above.
*/

SELECT BusinessEntityID AS 'SalesPersonID',
	   CASE
			WHEN CommissionPct = 0.00 THEN 'BAND 0'
			WHEN CommissionPct > 0.00 AND CommissionPct <= 0.01 THEN 'BAND 1'
			WHEN CommissionPct > 0.01 AND CommissionPct <= 0.015 THEN 'BAND 2'
			WHEN CommissionPct > 0.015 THEN 'BAND 3'
	   END AS 'Commission Band'
FROM Sales.SalesPerson
ORDER BY [Commission Band];

