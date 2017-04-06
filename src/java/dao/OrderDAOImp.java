/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


/**
 *
 * @author duonghan
 */
public class OrderDAOImp implements OrderDAO{

    private Session session = HibernateUtil.getSessionFactory().openSession();
    private Transaction transaction = null;

    @Override
    public boolean insertOrder(Order order) {

        try {
            transaction = session.beginTransaction();
            session.save(order);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return false;

    }

    @Override
    public boolean updateOrder(Order order) {
        try {
            transaction = session.beginTransaction();
            session.update(order);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return false;
    }

    @Override
    public boolean deleteOrder(Order order) {

        try {
            transaction = session.beginTransaction();
            session.delete(order);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return false;
    }

    
    
}
