package edu.phuxuan.k17.mvcdemo.model;

public class User {
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public User(String fullName) {
        super();
        this.fullName = fullName;
    }
    public User() {
    }
}