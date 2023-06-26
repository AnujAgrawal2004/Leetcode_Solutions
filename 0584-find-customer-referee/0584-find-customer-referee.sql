# Write your MySQL query statement below

# select name from Customer where referee_id not in(select referee_id from customer where referee_id = 2);

select name from customer where referee_id is null or referee_id!=2;