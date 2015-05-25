/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Entidades.Comentario;
import Entidades.Publicacion;
import java.util.ArrayList;

/**
 *
 * @author Oswaldo
 */
public class ComentarioClienteWS extends Operacion implements IComentario {

    public ArrayList<Comentario> obtenerComentarios(Publicacion publicacion){
        return null;
    }

    @Override
    public boolean meGusta(Comentario comentario) {
        comentario.meGusta = comentario.meGusta+1;
        return true;
    }

    @Override
    public boolean noMegusta(Comentario comentario) {
        comentario.noMeGusta = comentario.noMeGusta+1;
        return true;
    }
    

    @Override
    public boolean publicar(Publicacion comentario) {
       return true;
    }

    @Override
    public boolean eliminarPublicacion(Publicacion comentario) {
        return true;
    }
    
    
}
