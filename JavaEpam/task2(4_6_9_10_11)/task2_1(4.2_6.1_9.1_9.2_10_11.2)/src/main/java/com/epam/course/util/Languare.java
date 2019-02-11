package com.epam.course.util;

import java.util.Locale;

public enum Languare {
    ENG(new Locale("en", "UK")),
    RUS(new Locale("ru", "RU")),
    UA(new Locale("uk", "UA")),
    DE(new Locale("de", "DE"));

    private Locale locale;
    private Languare(Locale locale) {
        this.locale = locale;
    }

    public Locale getLocale() {
        return locale;
    }
}