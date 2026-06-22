-- ==========================================
-- Scenario 1: Process Monthly Interest
-- Stored Procedures - PL/SQL Exercise
-- ==========================================

SET SERVEROUTPUT ON;
SET LINESIZE 120
SET PAGESIZE 20
SET FEEDBACK ON
SET TRIMSPOOL ON

-- ------------------------------------------
-- Step 1: Create Savings Accounts Table
-- ------------------------------------------

CREATE TABLE savings_accounts (
    account_id NUMBER PRIMARY KEY,
    customer_name VARCHAR2(50),
    balance NUMBER
);

-- ------------------------------------------
-- Step 2: Insert Sample Data
-- ------------------------------------------

INSERT INTO savings_accounts VALUES (1, 'Arun', 10000);
INSERT INTO savings_accounts VALUES (2, 'Kiran', 20000);
INSERT INTO savings_accounts VALUES (3, 'Meena', 15000);

COMMIT;

-- ------------------------------------------
-- Step 3: View Initial Data
-- ------------------------------------------

SELECT * FROM savings_accounts;

-- ------------------------------------------
-- Step 4: Stored Procedure
-- Apply 1% monthly interest to all accounts
-- ------------------------------------------

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR rec IN (SELECT account_id, balance FROM savings_accounts) LOOP

        UPDATE savings_accounts
        SET balance = balance + (balance * 0.01)
        WHERE account_id = rec.account_id;

        DBMS_OUTPUT.PUT_LINE(
            'Interest applied for Account ID: ' || rec.account_id
        );

    END LOOP;

    COMMIT;
END;
/

-- ------------------------------------------
-- Step 5: Execute Procedure
-- ------------------------------------------

BEGIN
    ProcessMonthlyInterest;
END;
/

-- ------------------------------------------
-- Step 6: View Final Data
-- ------------------------------------------

SELECT * FROM savings_accounts;