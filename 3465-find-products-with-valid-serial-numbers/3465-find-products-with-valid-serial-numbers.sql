# Write your MySQL query statement below
SELECT product_id, product_name, description
FROM products
WHERE REGEXP_LIKE(description, '(^|[^[:alnum:]])SN[0-9]{4}-[0-9]{4}($|[^0-9])', 'c')
ORDER BY product_id;
