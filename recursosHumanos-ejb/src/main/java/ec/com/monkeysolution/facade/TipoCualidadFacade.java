/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.monkeysolution.facade;

import ec.com.monkeysolution.facade.local.TipoCualidadFacadeLocal;
import ec.com.monkeysolution.modelo.TipoCualidad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author luisp.araujo
 */
@Stateless
public class TipoCualidadFacade extends AbstractFacade<TipoCualidad> implements TipoCualidadFacadeLocal {

    @PersistenceContext(unitName = "recursosHumanosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoCualidadFacade() {
        super(TipoCualidad.class);
    }
    
}
