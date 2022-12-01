package com.RealParking.domain;

import java.time.LocalDate;

public class Ticket {

    private int idTicket;
    private String placa;
    private LocalDate entryTime;
    private LocalDate departureTime;
    private String stateTicket;

    public Ticket() {
    }

    public Ticket(String placa, LocalDate entryTime, LocalDate departureTime, String stateTicket) {
        this.placa = placa;
        this.entryTime = entryTime;
        this.departureTime = departureTime;
        this.stateTicket = stateTicket;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDate getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDate entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDate getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDate departureTime) {
        this.departureTime = departureTime;
    }

    public String getStateTicket() {
        return stateTicket;
    }

    public void setStateTicket(String stateTicket) {
        this.stateTicket = stateTicket;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "idTicket=" + idTicket +
                ", placa='" + placa + '\'' +
                ", entryTime=" + entryTime +
                ", departureTime=" + departureTime +
                ", stateTicket='" + stateTicket + '\'' +
                '}';
    }
}
