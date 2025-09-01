# Write your MySQL query statement below

with my_ct as (
select num, count(num) as appr from MyNumbers group by num
)

select max(num) as num from my_ct where appr = 1;