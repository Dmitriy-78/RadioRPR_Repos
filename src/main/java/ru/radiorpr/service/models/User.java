package ru.radiorpr.service.models;

public class User {
    private Long id;
    private String userName;
    private String password;

    public User() {
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }
}
