package com.epam.course.dao;

import com.epam.course.util.DataBaseManager;
import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

public class ConnectionPoolHolder {
    private static volatile DataSource dataSource;

    public static DataSource getDataSource(){
        if(dataSource == null){
            synchronized (ConnectionPoolHolder.class){
                if(dataSource == null){
                    BasicDataSource basicDataSource = new BasicDataSource();
                    basicDataSource.setUrl(DataBaseManager.CONFIG.getSettings("url"));
                    basicDataSource.setUsername(DataBaseManager.CONFIG.getSettings("user"));
                    basicDataSource.setPassword(DataBaseManager.CONFIG.getSettings("pass"));
                    basicDataSource.setMinIdle(Integer.valueOf(DataBaseManager.CONFIG.getSettings("min.idle")));
                    basicDataSource.setMaxIdle(Integer.valueOf(DataBaseManager.CONFIG.getSettings("max.idle")));
                    basicDataSource.setMaxOpenPreparedStatements(Integer.valueOf(DataBaseManager.CONFIG.getSettings("max.open.prepare.statements")));
                    dataSource = basicDataSource;
                }
            }
        }
        return dataSource;
    }
}
