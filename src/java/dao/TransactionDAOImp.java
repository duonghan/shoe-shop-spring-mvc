/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Transaction_;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;



/**
 *
 * @author duonghan
 */
public class TransactionDAOImp implements TransactionDAO{
    
    private Session session = HibernateUtil.getSessionFactory().openSession();
    private Transaction transaction = null;

    @Override
    public boolean insertTransaction(Transaction_ transaction_) {
        try {
            transaction = session.beginTransaction();
            session.save(transaction_);
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
    public boolean updateTransaction(Transaction_ transaction_) {
       try {
            transaction = session.beginTransaction();
            session.update(transaction_);
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
    public boolean deleteTransaction(Transaction_ transaction_) {
        try {
            transaction = session.beginTransaction();
            session.delete(transaction_);
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
