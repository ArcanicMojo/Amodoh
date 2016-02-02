/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Pierre
 */
@Local
public interface HelloDAOLocal {
    void save(HelloEntity h);
    void update(HelloEntity h);
    void remove(HelloEntity h);
    List<HelloEntity> findAll();
}
