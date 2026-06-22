-- ==========================================
-- Scenario 1: Loan Interest Discount System
-- Control Structures - PL/SQL Exercise
-- ==========================================

SET SERVEROUTPUT ON;
SET LINESIZE 200;
SET PAGESIZE 100;

-- ------------------------------------------
-- Step 1: Insert sample data
-- ------------------------------------------

INSERT INTO customers VALUES (1, 'Arun', 65, 15000, 10, 'FALSE');
INSERT INTO customers VALUES (2, 'Kiran', 45, 8000, 12, 'FALSE');
INSERT INTO customers VALUES (3, 'Meena', 70, 20000, 11, 'FALSE');

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
-- Step 3: Apply business logic using PL/SQL
-- Discount 1% for customers above age 60
-- ------------------------------------------

DECLARE
    CURSOR c_customers IS
        SELECT customer_id, age, loan_interest_rate
        FROM customers;

    v_new_rate NUMBER;
BEGIN
    FOR rec IN c_customers LOOP

        IF rec.age > 60 THEN

            v_new_rate := rec.loan_interest_rate - 1;

            UPDATE customers
            SET loan_interest_rate = v_new_rate
            WHERE customer_id = rec.customer_id;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied for Customer ID: ' || rec.customer_id
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/

-- ------------------------------------------
-- Step 4: Display final updated data
-- ------------------------------------------

SELECT * FROM customers;