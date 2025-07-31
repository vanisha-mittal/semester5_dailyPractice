-- Last updated: 7/31/2025, 5:18:05 PM
# Write your MySQL query statement below
select a.machine_id,round(avg(a.ed-a.st),3) as processing_time from (select machine_id,process_id,
sum(case when activity_type='start' then timestamp end) as st,
sum(case when activity_type='end' then timestamp end )as ed
from activity
group by machine_id,process_id ) as a
group by a.machine_id;