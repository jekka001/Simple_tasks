package com.epam.course.dao;

import com.epam.course.model.entity.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAO extends AbstractDAO<Employee> {

    public EmployeeDAO(Connection connection) {
        super(connection);
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<Employee>();
        String sql = "SELECT * FROM employee";
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setSurName(resultSet.getString("SurName"));
                employee.setName(resultSet.getString("Name"));
                employee.setPosition(resultSet.getString("Position"));
                employee.setDepartment(new DepartmentDAO(connection).findById(resultSet.getInt("id_department")));

                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement != null){
                close(statement);
            }
        }
        return employeeList;
    }

    @Override
    public Employee findById(int id) {
        String sql = "SELECT * FROM employee WHERE id=?";
        PreparedStatement preparedStatement = null;
        Employee employee = new Employee();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

            employee.setId(resultSet.getInt("id"));
            employee.setSurName(resultSet.getString("SurName"));
            employee.setName(resultSet.getString("Name"));
            employee.setPosition(resultSet.getString("Position"));
            employee.setDepartment(new DepartmentDAO(connection).findById(resultSet.getInt("id_department")));

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(preparedStatement);
        }
        return employee;
    }

    @Override
    public boolean delete(int id) {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM employee WHERE id = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(preparedStatement != null){
                close(preparedStatement);
            }
        }
        return false;
    }

    @Override
    public boolean delete(Employee entity) {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM employee WHERE id = ?";
        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, entity.getId());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(preparedStatement != null){
                close(preparedStatement);
            }
        }
        return false;
    }

    @Override
    public boolean create(Employee entity) {
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO employee (id, SurName, Name, Position, id_department) VALUES(?, ?, ?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, entity.getId());
            preparedStatement.setString(2,entity.getSurName());
            preparedStatement.setString(3, entity.getName());
            preparedStatement.setString(4, entity.getPosition());
            preparedStatement.setInt(5, entity.getDepartment().getId());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(preparedStatement != null){
                close(preparedStatement);
            }
        }
        return false;
    }

    @Override
    public Employee update(Employee entity) {
        PreparedStatement preparedStatement = null;
        String sql = "UPDATE employee SET SurName=?, Name=?, Position=?, id_department=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,entity.getSurName());
            preparedStatement.setString(2, entity.getName());
            preparedStatement.setString(3, entity.getPosition());
            preparedStatement.setInt(4, entity.getDepartment().getId());
            preparedStatement.setInt(5, entity.getId());
            preparedStatement.executeUpdate();
            return entity;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(preparedStatement != null){
                close(preparedStatement);
            }
        }
        return entity;
    }
}
