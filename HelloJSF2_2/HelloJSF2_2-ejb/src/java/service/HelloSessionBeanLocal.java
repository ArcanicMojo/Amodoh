/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.ejb.Local;

/**
 *
 * @author Pierre
 */
@Local
public interface HelloSessionBeanLocal {
    public String say(String nom);
}
