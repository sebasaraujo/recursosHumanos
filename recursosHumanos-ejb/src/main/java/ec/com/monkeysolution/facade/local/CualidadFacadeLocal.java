/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.monkeysolution.facade.local;

import ec.com.monkeysolution.modelo.Cualidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisp.araujo
 */
@Local
public interface CualidadFacadeLocal {

    void create(Cualidad cualidad);

    void edit(Cualidad cualidad);

    void remove(Cualidad cualidad);

    Cualidad find(Object id);

    List<Cualidad> findAll();

    List<Cualidad> findRange(int[] range);

    int count();
    
}
