package com.example.app.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// clase para el mapeo de los usuarios
public class Usuario {

    // aqui agregamos todas las variables que debemos recuperar

    // su id
    @SerializedName("idPersona") //aqui va el nombre que aparece en el json
    @Expose
    private Integer id; //aqui ponemos el nombre que queremos

    // su nombre
    @SerializedName("nombre")
    @Expose
    private String name;

    // su apellido
    @SerializedName("apellido")
    @Expose
    private String apellido;

    // su telefono
    @SerializedName("telefono")
    @Expose
    private String telefono;

    // su correo electronico
    @SerializedName("email")
    @Expose
    private String email;

    // su ruc
    @SerializedName("ruc")
    @Expose
    private String ruc;

    // su cedula
    @SerializedName("cedula")
    @Expose
    private String cedula;

    // su nombre
    @SerializedName("tipoPersona")
    @Expose
    private String tipoPersona;

    // su nombre
    @SerializedName("fechaNacimiento")
    @Expose
    private String fechaNacimiento;

    // ahora debemos crear el constructor

    public Usuario() {
    }

    //los metodos get y set


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
