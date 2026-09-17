-- Write your query below
SELECT name FROM customers
LEFT JOIN orders
    ON customer_id = customers.id
WHERE orders.id IS NULL;