package com.RealParking.persistence.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private int idTicket;

    private String placa;

    @Column(name = "hora_ingreso")
    private LocalDate horaIngreso;

    @Column(name = "hora_salida")
    private LocalDate horaSalida;

    private String estado;

    public Ticket() {
    }

    public Ticket(String placa, LocalDate horaIngreso, LocalDate horaSalida, String estado) {
        this.placa = placa;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.estado = estado;
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

    public LocalDate getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalDate horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public LocalDate getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDate horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "idTicket=" + idTicket +
                ", placa='" + placa + '\'' +
                ", horaIngreso=" + horaIngreso +
                ", horaSalida=" + horaSalida +
                ", estado='" + estado + '\'' +
                '}';
    }
}
