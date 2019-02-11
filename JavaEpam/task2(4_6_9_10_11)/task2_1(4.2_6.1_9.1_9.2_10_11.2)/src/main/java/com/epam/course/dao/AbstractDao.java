package com.epam.course.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class AbstractDao<T extends Object> {
    protected Connection connection;
    AbstractDao(Connection connection){
        this.connection = connection;
    }
    public abstract List<T> findAll();
    public abstract T findById(int id);
    public abstract boolean create(T entity);
    public abstract T update(T entity);
    public abstract boolean delete(T entity);
    public abstract boolean delete(int id);

    public void close(Statement st){
        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
