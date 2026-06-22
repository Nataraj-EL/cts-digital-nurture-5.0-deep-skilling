-- ==========================================
-- Scenario 2: Employee Bonus Update
-- Stored Procedures - PL/SQL Exercise
-- ==========================================

SET SERVEROUTPUT ON;

-- ------------------------------------------
-- Step 1: Create Employee Table
-- ------------------------------------------

CREATE TABLE employees (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(50),
    department VARCHAR2(30),
    salary NUMBER
);

-- ------------------------------------------
-- Step 2: Insert Sample Data
-- ------------------------------------------

INSERT INTO employees VALUES (1, 'Arun', 'IT', 50000);
INSERT INTO employees VALUES (2, 'Kiran', 'HR', 40000);
INSERT INTO employees VALUES (3, 'Meena', 'IT', 60000);
INSERT INTO employees VALUES (4, 'Ravi', 'Finance', 45000);

COMMIT;

-- ------------------------------------------
-- Step 3: View Initial Data
-- ------------------------------------------

SELECT * FROM employees;

-- ------------------------------------------
-- Step 4: Stored Procedure
-- Apply bonus to a given department
-- ------------------------------------------

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_percent IN NUMBER
)
IS
BEGIN
    FOR rec IN (
        SELECT emp_id, salary
        FROM employees
        WHERE department = p_department
    ) LOOP

        UPDATE employees
        SET salary = salary + (salary * p_bonus_percent / 100)
        WHERE emp_id = rec.emp_id;

        DBMS_OUTPUT.PUT_LINE(
            'Bonus applied for Employee ID: ' || rec.emp_id
        );

    END LOOP;

    COMMIT;
END;
/

-- ------------------------------------------
-- Step 5: Execute Procedure
-- Example: 10% bonus for IT department
-- ------------------------------------------

BEGIN
    UpdateEmployeeBonus('IT', 10);
END;
/

-- ------------------------------------------
-- Step 6: View Final Data
-- ------------------------------------------

SELECT * FROM employees;