-- ==========================================
-- Scenario 3: Loan Due Reminder System
-- Control Structures - PL/SQL Exercise
-- ==========================================

SET SERVEROUTPUT ON;
SET LINESIZE 200;
SET PAGESIZE 100;

-- ------------------------------------------
-- Step 1: Sample data setup (CUSTOMERS)
-- ------------------------------------------

INSERT INTO customers VALUES (1, 'Arun', 65, 15000, 6, 'TRUE');
INSERT INTO customers VALUES (2, 'Kiran', 45, 8000, 12, 'FALSE');
INSERT INTO customers VALUES (3, 'Meena', 70, 20000, 7, 'TRUE');

COMMIT;

-- ------------------------------------------
-- Step 2: Create LOANS table (if not exists)
-- ------------------------------------------

CREATE TABLE loans (
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    due_date DATE
);

-- ------------------------------------------
-- Step 3: Insert sample loan data
-- Some due within 30 days, some later
-- ------------------------------------------

INSERT INTO loans VALUES (101, 1, SYSDATE + 10);
INSERT INTO loans VALUES (102, 2, SYSDATE + 40);
INSERT INTO loans VALUES (103, 3, SYSDATE + 20);

COMMIT;

-- ------------------------------------------
-- Step 4: Display loan data
-- ------------------------------------------

SELECT * FROM loans;

-- ------------------------------------------
-- Step 5: Business logic
-- Reminder for loans due within next 30 days
-- ------------------------------------------

DECLARE
    CURSOR c_loans IS
        SELECT l.loan_id,
               l.customer_id,
               c.name,
               l.due_date
        FROM loans l
        JOIN customers c ON l.customer_id = c.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR rec IN c_loans LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID ' || rec.loan_id ||
            ' | Customer: ' || rec.name ||
            ' | Due Date: ' || TO_CHAR(rec.due_date, 'DD-MON-YYYY')
        );

    END LOOP;
END;
/

-- ------------------------------------------
-- Step 6: Final verification
-- ------------------------------------------

SELECT * FROM loans;