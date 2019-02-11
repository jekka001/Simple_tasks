package com.epam.course.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class AbstractDAO <T extends Object>{
    protected Connection connection;
    public AbstractDAO(Connection connection){
        this.connection = connection;
    }
    public abstract List<T> findAll() throws SQLException;
    public abstract T findById(int id) throws SQLException;
    public abstract boolean delete(int id);
    public abstract boolean delete(T entity);
    public abstract boolean create(T entity) throws SQLException;
    public abstract T update(T entity) throws SQLException;
    public void close(Statement st){
        try{
            if(st != null){
                st.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
