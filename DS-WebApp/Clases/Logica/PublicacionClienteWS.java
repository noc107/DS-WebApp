/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Entidades.Comentario;
import Entidades.Publicacion;
import Entidades.Usuario;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Oswaldo
 */
public class PublicacionClienteWS extends Operacion implements IPublicacion{
    public ArrayList<Comentario> obtenerComentarioPublicacion(Publicacion publicacion){
        
        return null;
    }
    
    public ArrayList<Publicacion> obtenerPublicacionesUsuario(Usuario usuario){
        ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
        ArrayList<String> comentarios = new ArrayList<String>();
        Date fechaPublicacion = new Date();
        Publicacion publicacion = new Publicacion("","","",comentarios,1,1,"","",fechaPublicacion);
        publicaciones.add(publicacion);
        return publicaciones;
    }

    @Override
    public boolean publicar(Publicacion publicacion) {
        return true;
    }

    @Override
    public boolean eliminarPublicacion(Publicacion publicacion) {
        return true;
    }

    @Override
    public boolean meGusta(Publicacion publicacion) {
        publicacion.meGusta = publicacion.meGusta+1;
        return true;
    }

    @Override
    public boolean noMeGusta(Publicacion publicacion) {
        publicacion.noMeGusta = publicacion.noMeGusta+1;
        return true;
    }
}
