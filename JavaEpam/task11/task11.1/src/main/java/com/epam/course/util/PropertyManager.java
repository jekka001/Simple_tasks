package com.epam.course.util;

import java.util.ResourceBundle;

public enum PropertyManager {
    CONFIG;
    private ResourceBundle resourceBundle;

    PropertyManager(){
        resourceBundle = ResourceBundle.getBundle("database");
    }
    public String getSetting(String key){
        return resourceBundle.getString(key);
    }
}
