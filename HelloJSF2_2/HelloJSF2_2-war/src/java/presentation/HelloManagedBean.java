/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import service.HelloSessionBeanLocal;

/**
 *
 * @author Pierre
 */
@ManagedBean
@RequestScoped
public class HelloManagedBean {

    String name;
    
    @EJB
    HelloSessionBeanLocal helloService;

    public HelloSessionBeanLocal getHelloService() {
        return helloService;
    }

    public void setHelloService(HelloSessionBeanLocal helloService) {
        this.helloService = helloService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     * Creates a new instance of HelloManagedBean
     */
    public HelloManagedBean() {
    }
    
    public String sayHello()
    {
        return helloService.say(name);
    }
    
}
