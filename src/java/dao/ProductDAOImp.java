/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
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
    private Session session = HibernateUtil.getSessionFactory().openSession();
    private Transaction transaction = null;

    @Override
    public boolean insertProduct(Product product) {

        try {
            
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
           session.beginTransaction();
            session.delete(product);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        return false;
    }

    @Override
    public Product findProduct(String name) {
        
        try {
            transaction = session.beginTransaction();
            Product product = (Product) session.beginTransaction();
            Query query = session.createQuery("from product where name= :name");
            query.setString("name", name);
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
    public ArrayList<Product> getlstProduct() {
        
        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from product");
            ArrayList<Product> lstProduct = (ArrayList<Product>) query.list();
            transaction.commit();
            return lstProduct;
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
