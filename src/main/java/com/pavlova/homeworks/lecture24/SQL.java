package com.pavlova.homeworks.lecture24;

public class SQL {
    String firstQuery = "select * from employees where id % 2 !=0 ";
    String secondQuery = "select * from employees where first_name = 'David'";
    String thirdQuery = "select * from employees where department_id = 54 and salary > 5000";
    String fourthQuery = "select * from employees where first_name like '%d'";
    String fifthQuery = "select * from employees where salary between 2000 and 4000";
    String sixthQuery = "select e.* from employees e join departments d on e.department_id = d.department_id" +
            "join locations l on d.location_id = l.location_id " +
            "join countries c on c.country_id = l.location_id" +
            "join regions r on r.region_id = c.region_id" +
            "where r.region_name = 'Europe'";
    String seventhQuery = "select manager_id, count(*) countEmployees " +
            "from employees Group by manager_id having countEmployees > 6";
    String eighthQuery = "select * from employees where manager_id " +
            "in (select employees_id from employees where employee_id=manager_id and salary > 10000) ";

}
