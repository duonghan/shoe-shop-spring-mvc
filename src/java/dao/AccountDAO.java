/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Account;

/**
 *
 * @author duonghan
 */
public interface AccountDAO {
    public boolean insertAccount(Account account);
    public boolean updateAccount(Account account);
    public boolean deleteAccount(Account account);
    public boolean checkAccount(Account account);
}
