/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Order;

/**
 *
 * @author duonghan
 */
public interface OrderDAO {
    public boolean insertOrder(Order order);
    public boolean updateOrder(Order order);
    public boolean deleteOrder(Order order);
}
