package com.epam.course;

import com.epam.course.dao.ConnectionPoolHolder;
import com.epam.course.dao.DepartmentDAO;
import com.epam.course.dao.EmployeeDAO;
import com.epam.course.dao.TaskDAO;
import com.epam.course.model.entity.Employee;
import com.epam.course.model.entity.Task;
import com.epam.course.service.WorkWithDB;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args){

        try {
            DepartmentDAO departmentDAO = new DepartmentDAO(ConnectionPoolHolder.getDataSource().getConnection());
            EmployeeDAO employeeDAO = new EmployeeDAO(ConnectionPoolHolder.getDataSource().getConnection());
            TaskDAO taskDAO = new TaskDAO(ConnectionPoolHolder.getDataSource().getConnection());
            WorkWithDB workWithDB = new WorkWithDB(departmentDAO,employeeDAO,taskDAO);

            Employee employer = employeeDAO.findById(1);
            System.out.println("List of all employees: ");
            List<Employee> employeeList = workWithDB.allEmployee();
            for(Employee employee : employeeList){
                System.out.println(employee);
            }
            System.out.println();
            System.out.println("List of all tasks:");
            List<Task> taskList = workWithDB.allTask();
            for(Task task : taskList){
                System.out.println(task);
            }
            System.out.println();
            System.out.println("List of all employees in the department:");
            List<Employee> employeeListByDepartment = workWithDB.employeeByDepartment(2);
            for(Employee employee : employeeListByDepartment){
                System.out.println(employee);
            }
            System.out.println();
            if(workWithDB.addTask(new Task(taskDAO.findAll().size()+1, "new task", employer))){
                System.out.println("Added");
            }else{
                System.out.println("Not Added");
            }
            System.out.println();
            System.out.println("List of all tasks for an employee:");
            List<Task> tasks = workWithDB.allTaskByEmployee(employer);
            for(Task task : tasks){
                System.out.println(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
