package com.example.navinsharma.gyanviharinfo;

public class User {
    public String id;
    public String userName;
    public String email;
    public String password;

    public User(String id, String userName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;

    }
    public String getId() {
        return id;
    }
    //setting id
    public void setId(String id) {
        this.id = id;
    }
    //getting name
    public String getName() {
        return userName;
    }
    //setting name
    public void setName(String name) {
        this.userName = name;
    }
    //getting password
    public String getPassword() {
        return password;
    }
    //setting password
    public void setPassword(String password) {
        this.password = password;
    }
}
