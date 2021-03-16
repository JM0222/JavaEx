-- ���� �������� � ���̺��� �ִ°�?
select * from tab;

-- ���̺� ����Ȯ��(desc)
describe employees;

select salary as ����, first_name as �̸�
from employees;

desc departments;

-- Example

select first_name, phone_number, hire_date, salary
from employees;

select first_name, last_name, phone_number, hire_date
from employees;

-- �ʵ�� ��ſ� ����� ���� dual << �������̺�( ������ ���� �̿� )
--select 300 * 2000 from dual;
select first_name, salary * 12 as ���� from employees;

-- NVL(expr1, expr2) expr1 null �̸� expr2 ���
-- null �ϰ�� 0���� replace
select first_name, salary, salary + (salary * nvl(commission_pct, 0))
from employees;

-- ���ڿ��� ���� (||)
select first_name || ' ' || last_name as name
from employees;

-- where example
select first_name, salary, salary *12 as ����
from employees
where salary >= 15000;

select first_name, hire_date
from employees
where hire_date >= '07/01/01';

select department_id, salary * 12 , hire_date
from employees
where first_name = 'Lex';

select *
from employees
where department_id = 10;

-- Like
--am ������ ��� �����
select first_name
from employees
where first_name like '%am%';
-- �ι�° ���ڰ� a�� ��� �����
select first_name
from employees
where first_name like '_a%';

select first_name, salary
from employees
where department_id = 90 and salary >= 20000; 

-- Between
select first_name, salary
from employees
where salary between
14000 and 17000;

-- IN  
select first_name, salary
from employees
where first_name in('Lex', 'John');

select * from employees
where department_id in (10, 20, 40);

select * from employees
where manager_id in(100,120,147);

-- IS NULL
select first_name, commission_pct from employees
where commission_pct is null;

select first_name, commission_pct from employees
where commission_pct is not null;

-- ORDER BY   (ASC(default),DESC)
select first_name, department_id, salary
from employees
order by department_id;

select first_name || ' ' || last_name as name
from employees
order by salary desc;

select department_id, salary, first_name || ' ' || last_name as name
from employees
order by department_id, salary desc;