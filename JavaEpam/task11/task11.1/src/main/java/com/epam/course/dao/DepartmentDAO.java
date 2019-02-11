package com.epam.course.dao;

import com.epam.course.model.entity.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO extends AbstractDAO<Department> {

    public DepartmentDAO(Connection connection) {
        super(connection);
    }

    @Override
    public List<Department> findAll() {
        List<Department> departmentList = new ArrayList<Department>();
        String sql = "SELECT * FROM department";
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Department department = new Department();
                department.setId(resultSet.getInt("id"));
                department.setName(resultSet.getString("Name"));
                department.setTelephone(resultSet.getString("Telephone"));

                departmentList.add(department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement != null){
                close(statement);
            }
        }
        return departmentList;
    }

    @Override
    public Department findById(int id) {
        String sql = "SELECT * FROM department WHERE id=?";
        PreparedStatement preparedStatement = null;
        Department department = new Department();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

            department.setId(resultSet.getInt("id"));
            department.setName(resultSet.getString("Name"));
            department.setTelephone(resultSet.getString("Telephone"));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(preparedStatement);
        }
        return department;
    }

    @Override
    public boolean delete(int id) {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM department WHERE id = ?";
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
    public boolean delete(Department entity) {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM department WHERE id = ?";
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
    public boolean create(Department entity) {
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO department (id, Name, Telephone) VALUES(?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, entity.getId());
            preparedStatement.setString(2,entity.getName());
            preparedStatement.setString(3, entity.getTelephone());
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
    public Department update(Department entity) {
        PreparedStatement preparedStatement = null;
        String sql = "UPDATE department SET Name=?, Telephone=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,entity.getName());
            preparedStatement.setString(2, entity.getTelephone());
            preparedStatement.setInt(3, entity.getId());
            preparedStatement.executeUpdate();
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
