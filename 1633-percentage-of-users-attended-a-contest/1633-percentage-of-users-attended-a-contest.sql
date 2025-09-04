# Write your MySQL query statement below
select r.contest_id, round((count(DISTINCT  r.user_id) * 100 )/(select count(*) from users), 2) as percentage
from Register r, Users u where u.user_id=r.user_id group by r.contest_id order by percentage desc;