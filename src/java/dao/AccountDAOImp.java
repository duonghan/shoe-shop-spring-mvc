/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Account;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author duonghan
 */
public class AccountDAOImp implements AccountDAO {

    private Session session = HibernateUtil.getSessionFactory().openSession();
    private Transaction transaction = null;

    @Override
    public boolean insertAccount(Account account) {

        try {
            transaction = session.beginTransaction();
            session.save(account);
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
    public boolean updateAccount(Account account) {
        try {
            transaction = session.beginTransaction();
            session.update(account);
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
    public boolean deleteAccount(Account account) {

        try {
            transaction = session.beginTransaction();
            session.delete(account);
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
    public boolean checkAccount(String username, String password) {
        List<Account> lstAccount = new ArrayList<>();
        try {
            session.beginTransaction();
            Query query = session.createQuery("from Account where username =:user and password =:pass ");
            query.setParameter("user", username);
            query.setParameter("pass", password);
            lstAccount = query.list();
            if (lstAccount.size() == 1) {
                return true;
            }
            return false;
        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean checkAdmin(String username) {
        List<Account> lstAccount = new ArrayList<>();
        try {
            Query query = session.createQuery("from Account where username =:user and role =true");
            query.setParameter("user", username);
            lstAccount = query.list();
            if (lstAccount.size() == 1) {
                return true;
            }
            session.getTransaction().commit();
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false;
    }

}
