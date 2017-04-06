/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author duonghan
 */
public class UserDAOImp implements UserDAO {

    private Session session = HibernateUtil.getSessionFactory().openSession();
    private Transaction transaction = null;

    @Override
    public boolean insertUser(User user) {

        try {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }

            System.out.println(e);
        } finally {
            session.close();
        }

        return false;
    }

    @Override
    public boolean updateUser(User user) {
       try {
            transaction = session.beginTransaction();
            session.update(user);
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
    public boolean deleteUser(User user) {
        try {
            transaction = session.beginTransaction();
            session.delete(user);
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

