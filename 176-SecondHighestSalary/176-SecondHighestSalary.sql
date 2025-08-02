-- Last updated: 8/2/2025, 4:02:45 PM
# Write your MySQL query statement below
SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE 
    salary<(SELECT MAX(salary) FROM Employee)
