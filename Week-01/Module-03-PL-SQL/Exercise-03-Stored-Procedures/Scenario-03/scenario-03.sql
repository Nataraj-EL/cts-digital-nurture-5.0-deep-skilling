-- ==========================================
-- Scenario 3: Fund Transfer Between Accounts
-- Stored Procedures - PL/SQL Exercise
-- ==========================================

SET SERVEROUTPUT ON;

-- ------------------------------------------
-- Step 1: Create Accounts Table
-- ------------------------------------------

CREATE TABLE accounts (
    account_id NUMBER PRIMARY KEY,
    account_holder VARCHAR2(50),
    balance NUMBER
);

-- ------------------------------------------
-- Step 2: Insert Sample Data
-- ------------------------------------------

INSERT INTO accounts VALUES (101, 'Arun', 10000);
INSERT INTO accounts VALUES (102, 'Kiran', 8000);
INSERT INTO accounts VALUES (103, 'Meena', 15000);

COMMIT;

-- ------------------------------------------
-- Step 3: View Initial Data
-- ------------------------------------------

SELECT * FROM accounts;

-- ------------------------------------------
-- Step 4: Stored Procedure
-- Transfer funds with validation
-- ------------------------------------------

CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account IN NUMBER,
    p_to_account IN NUMBER,
    p_amount IN NUMBER
)
IS
    v_balance NUMBER;
BEGIN
    -- Check source account balance
    SELECT balance INTO v_balance
    FROM accounts
    WHERE account_id = p_from_account;

    -- Validate sufficient balance
    IF v_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient balance in account ' || p_from_account);
        RETURN;
    END IF;

    -- Deduct from source account
    UPDATE accounts
    SET balance = balance - p_amount
    WHERE account_id = p_from_account;

    -- Add to destination account
    UPDATE accounts
    SET balance = balance + p_amount
    WHERE account_id = p_to_account;

    DBMS_OUTPUT.PUT_LINE(
        'Transferred ' || p_amount ||
        ' from Account ' || p_from_account ||
        ' to Account ' || p_to_account
    );

    COMMIT;

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Transaction failed: ' || SQLERRM);
END;
/

-- ------------------------------------------
-- Step 5: Execute Procedure
-- Example transfer
-- ------------------------------------------

BEGIN
    TransferFunds(101, 102, 2000);
END;
/

-- ------------------------------------------
-- Step 6: View Final Data
-- ------------------------------------------

SELECT * FROM accounts;