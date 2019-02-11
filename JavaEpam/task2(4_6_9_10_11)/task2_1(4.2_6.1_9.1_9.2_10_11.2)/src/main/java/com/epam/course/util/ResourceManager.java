package com.epam.course.util;

import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public enum ResourceManager {
    INSTANCE;
    private ResourceBundle resourceBundle;

    private ResourceManager() {
        resourceBundle = ResourceBundle.getBundle("property.message", new Locale("en", "UK"));
    }

    public void changeLocale(Locale locale) {
        resourceBundle = ResourceBundle.getBundle("property.message", locale);
    }

    public String getMessage(String key) {
        return resourceBundle.getString(key);
    }
}
