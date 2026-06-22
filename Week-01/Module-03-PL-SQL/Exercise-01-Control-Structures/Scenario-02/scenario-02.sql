-- ==========================================
-- Scenario 2: VIP Customer Promotion System
-- Control Structures - PL/SQL Exercise
-- ==========================================

SET SERVEROUTPUT ON;
SET LINESIZE 200;
SET PAGESIZE 100;

-- ------------------------------------------
-- Step 1: Ensure sample data exists
-- (Run only if table is empty)
-- ------------------------------------------

INSERT INTO customers VALUES (1, 'Arun', 65, 15000, 9, 'FALSE');
INSERT INTO customers VALUES (2, 'Kiran', 45, 8000, 12, 'FALSE');
INSERT INTO customers VALUES (3, 'Meena', 70, 20000, 10, 'FALSE');

COMMIT;

-- ------------------------------------------
-- Step 2: Display initial data
-- ------------------------------------------

COLUMN customer_id FORMAT 999
COLUMN name FORMAT A15
COLUMN age FORMAT 999
COLUMN balance FORMAT 999999
COLUMN loan_interest_rate FORMAT 999
COLUMN is_vip FORMAT A5

SELECT * FROM customers;

-- ------------------------------------------
-- Step 3: Business logic
-- Customers with balance > 10000 become VIP
-- ------------------------------------------

DECLARE
    CURSOR c_customers IS
        SELECT customer_id, balance, is_vip
        FROM customers;
BEGIN
    FOR rec IN c_customers LOOP

        IF rec.balance > 10000 THEN

            UPDATE customers
            SET is_vip = 'TRUE'
            WHERE customer_id = rec.customer_id;

            DBMS_OUTPUT.PUT_LINE(
                'VIP status updated for Customer ID: ' || rec.customer_id
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/

-- ------------------------------------------
-- Step 4: Show final results
-- ------------------------------------------

SELECT * FROM customers;