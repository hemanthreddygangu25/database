select d.name as Department,e.name as Employee,e.salary as Salary 
FROM (
    SELECT e.*,
           DENSE_RANK() OVER (
               PARTITION BY e.departmentId
               ORDER BY e.salary DESC
           ) AS rnk
    FROM Employee e
) e
 join 
department d on e.departmentId=d.id where rnk<=3 order by e.salary,d.name;