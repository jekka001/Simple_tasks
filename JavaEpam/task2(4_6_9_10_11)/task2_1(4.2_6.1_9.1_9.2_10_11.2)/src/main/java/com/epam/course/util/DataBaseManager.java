package com.epam.course.util;

import java.util.ResourceBundle;

public enum DataBaseManager {
    CONFIG;

    private ResourceBundle resourceBundle;

     DataBaseManager(){
        resourceBundle = ResourceBundle.getBundle("database");
    }

    public String getSettings(String key){return resourceBundle.getString(key);}
}
