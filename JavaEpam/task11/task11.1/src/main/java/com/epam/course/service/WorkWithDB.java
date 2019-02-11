package com.epam.course.service;

import com.epam.course.dao.DepartmentDAO;
import com.epam.course.dao.EmployeeDAO;
import com.epam.course.dao.TaskDAO;
import com.epam.course.model.entity.Employee;
import com.epam.course.model.entity.Task;

import java.util.ArrayList;
import java.util.List;

public class WorkWithDB {
    private DepartmentDAO departmentDAO;
    private EmployeeDAO employeeDAO;
    private TaskDAO taskDAO;

    public WorkWithDB() {
    }

    public WorkWithDB(DepartmentDAO departmentDAO, EmployeeDAO employeeDAO, TaskDAO taskDAO) {
        this.departmentDAO = departmentDAO;
        this.employeeDAO = employeeDAO;
        this.taskDAO = taskDAO;
    }

    public List<Employee> allEmployee(){
        return employeeDAO.findAll();
    }

    public List<Task> allTask(){
        return taskDAO.findAll();
    }

    public List<Employee> employeeByDepartment(int id_department){
        List<Employee> employees = employeeDAO.findAll();
        List<Employee> result = new ArrayList<Employee>();
        for(Employee employee : employees){
            if(employee.getDepartment().getId() == id_department){
                result.add(employee);
            }
        }
        return result;
    }

    public boolean addTask(Task task){
        return taskDAO.create(task);
    }

    public List<Task> allTaskByEmployee(Employee employee){
        List<Task> tasks  = taskDAO.findAll();
        List<Task> result = new ArrayList<Task>();
        for(Task task : tasks){
            if(task.getEmployee().getId() == employee.getId()){
                result.add(task);
            }
        }
        return result;
    }

}
