-- Last updated: 7/31/2025, 5:20:44 PM
# Write your MySQL query statement below
select requester_id as id,count(*)as num 
from(select requester_id from RequestAccepted 
union all
select accepter_id from RequestAccepted) as a
group by id
order by count(*) desc
limit 1;
