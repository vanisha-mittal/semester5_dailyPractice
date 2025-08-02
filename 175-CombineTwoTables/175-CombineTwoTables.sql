-- Last updated: 8/2/2025, 4:02:46 PM
# Write your MySQL query statement below
SELECT firstName,lastName,city,state
FROM Person as p
LEFT JOIN Address as a
    on p.personID=a.personID