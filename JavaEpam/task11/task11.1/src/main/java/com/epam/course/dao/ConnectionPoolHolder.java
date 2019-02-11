package com.epam.course.dao;

import com.epam.course.util.PropertyManager;
import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

public class ConnectionPoolHolder {
    private static volatile DataSource dataSource;

    public static DataSource getDataSource(){
        if(dataSource == null){
            synchronized (ConnectionPoolHolder.class){
                if(dataSource == null){
                    BasicDataSource basicDataSource = new BasicDataSource();
                    basicDataSource.setUrl(PropertyManager.CONFIG.getSetting("url"));
                    basicDataSource.setUsername(PropertyManager.CONFIG.getSetting("user"));
                    basicDataSource.setPassword(PropertyManager.CONFIG.getSetting("pass"));
                    basicDataSource.setMinIdle(Integer.valueOf(PropertyManager.CONFIG.getSetting("min.idle")));
                    basicDataSource.setMaxIdle(Integer.valueOf(PropertyManager.CONFIG.getSetting("max.idle")));
                    basicDataSource.setMaxOpenPreparedStatements(Integer.valueOf(PropertyManager.CONFIG.getSetting("max.open.prepare.statements")));
                    dataSource = basicDataSource;
                }
            }
        }
        return dataSource;
    }
}
