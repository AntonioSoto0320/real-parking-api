package com.RealParking.domain.dto;

import com.RealParking.domain.Role;

import java.sql.Blob;

public class UserDTO {

    private int idUser;
    private String user;
    private String password;
    private String fullName;
    private String stateUser;
    private Role role;
    private Blob photo;

    public UserDTO() {
    }

    public UserDTO(String user, String password, String fullName, String stateUser, Role role, Blob photo) {
        this.user = user;
        this.password = password;
        this.fullName = fullName;
        this.stateUser = stateUser;
        this.role = role;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "idUser=" + idUser +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", stateUser='" + stateUser + '\'' +
                ", role=" + role +
                ", photo=" + photo +
                '}';
    }
}
