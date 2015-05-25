/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Entidades.Comentario;

/**
 *
 * @author Oswaldo
 */
public interface IComentario {
    public boolean meGusta(Comentario comentario);
    public boolean noMegusta(Comentario comentario);
}
