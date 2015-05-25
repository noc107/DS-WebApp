/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Entidades.Publicacion;

/**
 *
 * @author Oswaldo
 */
public interface IPublicacion {
    public boolean meGusta(Publicacion publicacion);
    public boolean noMeGusta(Publicacion publicacion);
}
