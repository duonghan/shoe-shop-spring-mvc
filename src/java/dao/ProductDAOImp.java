/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Product;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author duonghan
 */
public class ProductDAOImp implements ProductDAO {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private Session session = sessionFactory.openSession();
    private Transaction transaction = null;

    @Override
    public boolean insertProduct(Product product) {

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean updateProduct(Product product) {

        try {
            transaction = session.beginTransaction();
            session.update(product);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }

        return false;
    }

    @Override
    public boolean deleteProduct(Product product) {

        try {
            transaction = session.beginTransaction();
            session.delete(product);
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
    public Product findByID(int productID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Product product = (Product) session.beginTransaction();
            transaction.commit();
            return product;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }

        return null;
    }

    @Override
    public ArrayList<Product> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from product");
            ArrayList<Product> lstProduct = (ArrayList<Product>) query.list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        } finally {
            session.flush();
            session.close();
        }
        return null;
    }

}
