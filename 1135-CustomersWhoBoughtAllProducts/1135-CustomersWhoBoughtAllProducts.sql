-- Last updated: 7/31/2025, 5:19:19 PM
# Write your MySQL query statement below
select customer_id from customer
group by customer_id 
having count(distinct product_key)=(select count(*) from product);