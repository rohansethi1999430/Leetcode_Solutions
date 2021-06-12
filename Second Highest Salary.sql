# Write your MySQL query statement below
Select max(Salary) as SecondHighestSalary
from Employee
where Salary not in (
        select max(salary)
        from Employee
    )