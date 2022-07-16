package com.example.crud;

import com.mysql.cj.conf.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class Student
{
    private final SimpleStringProperty id;
    private final SimpleStringProperty name;
    private final SimpleStringProperty mobile;
    private final SimpleStringProperty  course;

    public Student()
    {
        id = new SimpleStringProperty(this, "id");
        name = new SimpleStringProperty(this, "name");
        mobile = new SimpleStringProperty(this, "mobile");
        course = new SimpleStringProperty(this, "course");
    }

    public SimpleStringProperty idProperty() { return id; }
    public String getId() { return id.get(); }
    public void setId(String newId) { id.set(newId); }

    public SimpleStringProperty nameProperty() { return name; }
    public String getName() { return name.get(); }
    public void setName(String newName) { name.set(newName); }

    public SimpleStringProperty mobileProperty() { return mobile; }
    public String getMobile() { return mobile.get(); }
    public void setMobile(String newMobile) { mobile.set(newMobile); }

    public SimpleStringProperty courseProperty() { return course; }
    public String getCourse() { return course.get(); }
    public void setCourse(String newCourse) { course.set(newCourse); }
}
