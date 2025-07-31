-- Last updated: 7/31/2025, 5:22:11 PM
# Write your MySQL query statement below
select name as Customers from customers where id not in (select customerId from orders);