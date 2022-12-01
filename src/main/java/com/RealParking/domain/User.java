package com.RealParking.domain;

import java.sql.Blob;

public class User {

    private int idUser;
    private String user;
    private String password;
    private String fullName;
    private String stateUser;
    private Role rol;
    private Blob photo;

    public User() {
    }

    public User(String user, String password, String fullName, String stateUser, Role rol, Blob photo) {
        this.user = user;
        this.password = password;
        this.fullName = fullName;
        this.stateUser = stateUser;
        this.rol = rol;
        this.photo = photo;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStateUser() {
        return stateUser;
    }

    public void setStateUser(String stateUser) {
        this.stateUser = stateUser;
    }

    public Role getRol() {
        return rol;
    }

    public void setRol(Role rol) {
        this.rol = rol;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", stateUser='" + stateUser + '\'' +
                ", rol=" + rol +
                ", photo=" + photo +
                '}';
    }
}
