/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author Alejandro
 */
public class Evento {
    private int id_evento;
    private int id_persona;
    private String nombre_eve;
    private String dia;
    private int hora_ini;
    private int hora_fin;

    public Evento() {
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre_eve() {
        return nombre_eve;
    }

    public void setNombre_eve(String nombre_eve) {
        this.nombre_eve = nombre_eve;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getHora_ini() {
        return hora_ini;
    }

    public void setHora_ini(int hora_ini) {
        this.hora_ini = hora_ini;
    }

    public int getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(int hora_fin) {
        this.hora_fin = hora_fin;
    }
    
    
    
}
