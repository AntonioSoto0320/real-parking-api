package com.RealParking.domain.dto;

public class RoleDTO {

    private int idRole;
    private String description;
    private String stateRol;

    public RoleDTO() {
    }

    public RoleDTO(String description, String stateRol) {
        this.description = description;
        this.stateRol = stateRol;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStateRol() {
        return stateRol;
    }

    public void setStateRol(String stateRol) {
        this.stateRol = stateRol;
    }

    @Override
    public String toString() {
        return "Role{" +
                "idRole=" + idRole +
                ", description='" + description + '\'' +
                ", stateRol='" + stateRol + '\'' +
                '}';
    }
}
