package com.RealParking.persistence.entity;



import javax.persistence.*;



@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int idUsuarios;


    private String usuario;

    @Column(name = "pass")
    private String contraseña;

    @Column(name = "nombre_completo")
    private String nombreCompleto;

    private String estado;


    @ManyToOne()
    @JoinColumn(name = "id_rol",insertable = false,updatable = false)
    private Rol rol;


    private String foto;

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, String nombreCompleto, String estado, Rol rol, String foto) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombreCompleto = nombreCompleto;
        this.estado = estado;
        this.rol = rol;
        this.foto = foto;
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuarios=" + idUsuarios +
                ", usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", estado='" + estado + '\'' +
                ", rol=" + rol +
                ", foto='" + foto + '\'' +
                '}';
    }
}
