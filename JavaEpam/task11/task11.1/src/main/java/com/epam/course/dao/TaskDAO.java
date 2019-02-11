package com.epam.course.dao;

import com.epam.course.model.entity.Task;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO extends AbstractDAO<Task> {

    public TaskDAO(Connection connection) {
        super(connection);
    }

    @Override
    public List<Task> findAll()  {
        List<Task> taskList = new ArrayList<Task>();
        String sql = "SELECT * FROM task";
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setDescription(resultSet.getString("description"));
                task.setEmployee(new EmployeeDAO(connection).findById(resultSet.getInt("id_employee")));

                taskList.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement != null){
                close(statement);
            }
        }
        return taskList;
    }

    @Override
    public Task findById(int id) {
        String sql = "SELECT * FROM task WHERE id=?";
        PreparedStatement preparedStatement = null;
        Task task = new Task();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

            task.setId(resultSet.getInt("id"));
            task.setDescription(resultSet.getString("Description"));
            task.setEmployee(new EmployeeDAO(connection).findById(resultSet.getInt("id_employee")));

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(preparedStatement);
        }
        return task;
    }

    @Override
    public boolean delete(int id) {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM task WHERE id = ?";
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
    public boolean delete(Task entity) {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM task WHERE id = ?";
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
    public boolean create(Task entity) {
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO task (id, Description, id_employee) VALUES(?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, entity.getId());
            preparedStatement.setString(2,entity.getDescription());
            preparedStatement.setInt(3, entity.getEmployee().getId());
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
    public Task update(Task entity) {
        PreparedStatement preparedStatement = null;
        String sql = "UPDATE task SET Description=?, id_employee=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,entity.getDescription());
            preparedStatement.setInt(2, entity.getEmployee().getId());
            preparedStatement.setInt(3, entity.getId());
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
