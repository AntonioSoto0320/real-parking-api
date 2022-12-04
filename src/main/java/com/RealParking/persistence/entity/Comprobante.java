package com.RealParking.persistence.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "comprobante")
public class Comprobante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comprobante")
    private int idComprobante;

    @OneToOne
    @JoinColumn(name = "id_ticket")
    private Ticket ticket;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private LocalDate fecha;

    private double importe;


    public Comprobante() {
    }

    public Comprobante(Ticket ticket, Usuario usuario, LocalDate fecha, double importe) {
        this.ticket = ticket;
        this.usuario = usuario;
        this.fecha = fecha;
        this.importe = importe;
    }

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Comprobante{" +
                "idComprobante=" + idComprobante +
                ", ticket=" + ticket +
                ", usuario=" + usuario +
                ", fecha=" + fecha +
                ", importe=" + importe +
                '}';
    }
}
