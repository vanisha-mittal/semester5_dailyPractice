-- Last updated: 7/31/2025, 5:20:41 PM
# Write your MySQL query statement below
select max(num) as num from (
    select num from MyNumbers group by num having count(num)=1
) as distinct_num;
