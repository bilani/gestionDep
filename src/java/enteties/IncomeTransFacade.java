/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enteties;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mohamad Bilani
 */
@Stateless
public class IncomeTransFacade extends AbstractFacade<IncomeTrans> {
    @PersistenceContext(unitName = "depensePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public IncomeTransFacade() {
        super(IncomeTrans.class);
    }
    
}
