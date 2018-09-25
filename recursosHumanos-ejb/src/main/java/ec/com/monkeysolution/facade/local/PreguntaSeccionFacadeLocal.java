/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.monkeysolution.facade.local;

import ec.com.monkeysolution.modelo.PreguntaSeccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisp.araujo
 */
@Local
public interface PreguntaSeccionFacadeLocal {

    void create(PreguntaSeccion preguntaSeccion);

    void edit(PreguntaSeccion preguntaSeccion);

    void remove(PreguntaSeccion preguntaSeccion);

    PreguntaSeccion find(Object id);

    List<PreguntaSeccion> findAll();

    List<PreguntaSeccion> findRange(int[] range);

    int count();
    
}
