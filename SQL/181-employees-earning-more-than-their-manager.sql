SELECT e.name AS Employee
FROM Employee e
JOIN Employee mgr ON e.managerId = mgr.id
WHERE e.salary > mgr.salary