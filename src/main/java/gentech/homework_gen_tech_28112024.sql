create database oe;
use oe;
 -- 1. Вывести имя, фамилию покупателей и даты их заказов(order_date).
select t1.cust_first_name, t1.cust_last_name, t2.order_date
from customers t1
 join orders t2
on t1.customer_id = t2.customer_id;

-- 2. Вывести даты заказов продуктов и описание этих продуктов(product_description).

select t1.order_date, t3.product_description
from orders t1
 join order_items t2
on t1.order_id = t2.order_id
 join product_information t3
 on t2.product_id = t3.product_id;
 
 -- 3. Вывести имя, фамилию покупателей, даты заказов(orderdate), описание продуктов, 
  -- которые они заказали и категории соответствующих продуктов (categoryname).
  
select t1.cust_first_name, t1.cust_last_name, t2.order_date, t4.product_description, t5.category_name
from customers t1
 join orders t2
 on t1.customer_id = t2.customer_id
  join order_items t3
  on t2.order_id = t3.order_id
   join product_information t4
   on t3.product_id = t4.product_id
    join categories_tab t5
    on t5.category_id = t4.category_id;
    
    -- 4 Вывести названия(productname), описания категорий(categorydescription) 
    -- и количества(quantity) тех продуктов, у которых минимальная стоимость (min_price) больше 300.
    
    SELECT t1.product_name, t1.product_description, t2.quantity
    FROM 
    oe.product_information t1
    join order_items t2
    on t1.product_id = t2.product_id
    where t1.MIN_PRICE > 300;
    
    -- 5. Вывести имя, фамилию всех женатых мужчин покупателей, 
     -- которые купили продукты со стоимостью (list_price) больше 550.

select t1.cust_first_name, t1.cust_last_name
from customers t1
 join orders t2
 on t1.customer_id = t2.customer_id
  join order_items t3
  on t2.order_id = t3.order_id
   join product_information t4
   on t3.product_id = t4.product_id
where t1.gender = 'M'
 and t1.marital_status = 'married'
 and t4.list_price > 550;
 
 -- 6 Вывести те продукты(productname), которых нет в заказанных (таблица orderitems).
 
 SELECT t1.product_name
 FROM product_information t1
left join order_items t2
 on t1.PRODUCT_ID = t2.PRODUCT_ID
 where t2.product_id is null;
 
 -- 7 Вывести покупателей(custfirstname, custlastname), которые ничего не заказали (таблица orders).
 select t1.cust_first_name, t1.cust_last_name
   from customers t1
   left join orders t2
   on t1.customer_id = t2.customer_id
   where t2.customer_id is null;
 