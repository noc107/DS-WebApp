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
public class Comentario extends Publicacion {
    public ArrayList<String> tags;

    public Comentario(ArrayList<String> tags, String id, String texto, String foto, ArrayList<String> destinatarios, int coordenadaX, int coordenadaY, String meGusta, String noMeGusta, Date fechaPublicacion) {
        super(id, texto, foto, destinatarios, coordenadaX, coordenadaY, meGusta, noMeGusta, fechaPublicacion);
        this.tags = tags;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

}
