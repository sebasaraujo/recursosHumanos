/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.monkeysolution.facade.local;

import ec.com.monkeysolution.modelo.Area;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisp.araujo
 */
@Local
public interface AreaFacadeLocal {

    void create(Area area);

    void edit(Area area);

    void remove(Area area);

    Area find(Object id);

    List<Area> findAll();

    List<Area> findRange(int[] range);

    int count();

    /**
     * Metodo que obtiene las areas de un departamento
     * @param departamento
     * @return
     */
	List<Area> obtenerAreaXDepartamento(Integer departamento);
    
}
