/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Oswaldo
 */
public class Publicacion {
    public String id;
    public String texto;
    public String foto;
    public ArrayList<String> destinatarios;
    public int coordenadaX;
    public int coordenadaY;
    public String meGusta;
    public String noMeGusta;
    public Date fechaPublicacion;
    public ArrayList<Comentario> comentarios;

    public Publicacion(){
    
    }
    
    public Publicacion(String id, String texto, String foto, ArrayList<String> destinatarios, int coordenadaX, int coordenadaY, String meGusta, String noMeGusta, Date fechaPublicacion) {
        this.id = id;
        this.texto = texto;
        this.foto = foto;
        this.destinatarios = destinatarios;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.meGusta = meGusta;
        this.noMeGusta = noMeGusta;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public ArrayList<String> getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(ArrayList<String> destinatarios) {
        this.destinatarios = destinatarios;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public String getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(String meGusta) {
        this.meGusta = meGusta;
    }

    public String getNoMeGusta() {
        return noMeGusta;
    }

    public void setNoMeGusta(String noMeGusta) {
        this.noMeGusta = noMeGusta;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
        
}
