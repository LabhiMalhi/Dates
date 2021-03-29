package com.Malhi;

import java.util.Date;

public class StudyOfDate {
    private String Name;
    private Date date;

    public StudyOfDate(String name, Date date) {
        Name = name;
        this.date = date;
    }

    public String getName() {
        return Name;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "StudyOfDate{" +
                "Name='" + Name + '\'' +
                ", date=" + date +
                '}';
    }
}
