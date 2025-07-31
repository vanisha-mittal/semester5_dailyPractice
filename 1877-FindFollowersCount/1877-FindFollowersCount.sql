-- Last updated: 7/31/2025, 5:17:59 PM
# Write your MySQL query statement below
select user_id,count(follower_id) as followers_count from followers group by user_id order by user_id;