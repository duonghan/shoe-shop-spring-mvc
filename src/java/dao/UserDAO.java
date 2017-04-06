/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import model.User;

/**
 *
 * @author duonghan
 */
public interface UserDAO {
    public boolean insertUser(User user);
    public boolean updateUser(User user);
    public boolean deleteUser(User user);
}
