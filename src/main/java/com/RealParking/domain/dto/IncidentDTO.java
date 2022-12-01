package com.RealParking.domain.dto;

import com.RealParking.domain.Ticket;
import com.RealParking.domain.User;

import java.time.LocalDate;

public class IncidentDTO {

    private int idIncident;
    private Ticket ticket;
    private User user;
    private String dni;
    private String fullName;
    private LocalDate date;

    public IncidentDTO() {
    }

    public IncidentDTO(Ticket ticket, User user, String dni, String fullName, LocalDate date) {
        this.ticket = ticket;
        this.user = user;
        this.dni = dni;
        this.fullName = fullName;
        this.date = date;
    }

    public int getIdIncident() {
        return idIncident;
    }

    public void setIdIncident(int idIncident) {
        this.idIncident = idIncident;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Incident{" +
                "idIncidente=" + idIncident +
                ", ticket=" + ticket +
                ", user=" + user +
                ", dni='" + dni + '\'' +
                ", fullName='" + fullName + '\'' +
                ", date=" + date +
                '}';
    }
}
