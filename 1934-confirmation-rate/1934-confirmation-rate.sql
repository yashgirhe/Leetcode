# Write your MySQL query statement below
select s.user_id, IFNULL(round(sum(action = "confirmed")/count(*),2),0.00) 
as confirmation_rate
from signups as s
left join confirmations as c
on s.user_id = c.user_id
group by s.user_id;