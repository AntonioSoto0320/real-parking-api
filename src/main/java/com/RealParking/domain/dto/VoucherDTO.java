package com.RealParking.domain.dto;

import com.RealParking.domain.Ticket;
import com.RealParking.domain.User;

import java.time.LocalDate;

public class VoucherDTO {

    private int idVoucher;
    private Ticket ticket;
    private User user;
    private LocalDate date;
    private double amount;

    public VoucherDTO() {
    }

    public VoucherDTO(Ticket ticket, User user, LocalDate date, double amount) {
        this.ticket = ticket;
        this.user = user;
        this.date = date;
        this.amount = amount;
    }

    public int getIdVoucher() {
        return idVoucher;
    }

    public void setIdVoucher(int idVoucher) {
        this.idVoucher = idVoucher;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "idVoucher=" + idVoucher +
                ", ticket=" + ticket +
                ", user=" + user +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
