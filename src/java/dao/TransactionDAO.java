/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Transaction_;

/**
 *
 * @author duonghan
 */
public interface TransactionDAO {
    public boolean insertTransaction(Transaction_ transaction_);
    public boolean updateTransaction(Transaction_ transaction_);
    public boolean deleteTransaction(Transaction_ transaction_);
    
}
