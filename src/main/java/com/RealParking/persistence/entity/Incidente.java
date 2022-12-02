package com.RealParking.persistence.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "incidente")
public class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_incidente")
    private int idIncidente;

    @OneToOne
    @JoinColumn(name = "id_ticket")
    private Ticket ticket;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private String dni;

    @Column(name = "nombre_completo")
    private String nombreCompleto;

    private LocalDate fecha;

    public Incidente() {
    }

    public Incidente(Ticket ticket, Usuario usuario, String dni, String nombreCompleto, LocalDate fecha) {
        this.ticket = ticket;
        this.usuario = usuario;
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.fecha = fecha;
    }

    public int getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(int idIncidente) {
        this.idIncidente = idIncidente;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Incidente{" +
                "idIncidente=" + idIncidente +
                ", ticket=" + ticket +
                ", usuario=" + usuario +
                ", dni='" + dni + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
