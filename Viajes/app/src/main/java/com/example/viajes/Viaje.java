package com.example.viajes;

import java.io.Serializable;

public class Viaje implements Serializable {

    private  String cuidadOrigen;
    private  String cuidadDestino;
    private  String fechaSalida;
    private  String fechaLlegada;
    private  String dirDestino;
    private  String dirSalida;
    private String nombre;
    private  String dni;

    public String getCuidadDestino() {
        return cuidadDestino;
    }

    public String getCuidadOrigen() {
        return cuidadOrigen;
    }

    public String getDirDestino() {
        return dirDestino;
    }

    public String getDirSalida() {
        return dirSalida;
    }

    public String getDni() {
        return dni;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCuidadOrigen(String cuidadOrigen) {
        this.cuidadOrigen = cuidadOrigen;
    }

    public void setCuidadDestino(String cuidadDestino) {
        this.cuidadDestino = cuidadDestino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public void setDirDestino(String dirDestino) {
        this.dirDestino = dirDestino;
    }

    public void setDirSalida(String dirSalida) {
        this.dirSalida = dirSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
