-- Last updated: 7/31/2025, 5:20:45 PM
# Write your MySQL query statement below
select class from courses group by class having count(student)>4;