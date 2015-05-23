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
    public boolean meGusta() {
        return true;
    }

    @Override
    public boolean noMegusta() {
        return true;
    }

    @Override
    public boolean publicar() {
       return true;
    }

    @Override
    public boolean eliminarPublicacion() {
        return true;
    }
    
    
}
