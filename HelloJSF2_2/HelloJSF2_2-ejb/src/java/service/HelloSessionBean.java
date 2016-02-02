/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.HelloDAOLocal;
import dao.HelloEntity;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Pierre
 */
@Stateless
public class HelloSessionBean implements HelloSessionBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @EJB
    HelloDAOLocal helloDAO;

    @Override
    public String say(String nom) {
        if(nom != null && nom.length()>0)
        {
            String message = "Bonjour " + nom + ". Tu vas bien ?";
            HelloEntity h = new HelloEntity();
            h.setMessage(message);
            helloDAO.save(h);
            return "Bonjour " + nom + ". Tu vas bien ?";
        }
        else
            return("");
    }
}
