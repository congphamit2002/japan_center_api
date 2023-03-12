package com.backend.japancenterapi.payload;

public class CourseRespone {
    private int course_id;
    private String avatar;
    private double price;
    private String description;
    private double totalstar;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTotalstar() {
        return totalstar;
    }

    public void setTotalstar(double totalstar) {
        this.totalstar = totalstar;
    }
}
