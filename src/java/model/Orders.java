package model;
// Generated Apr 6, 2017 12:29:42 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Orders generated by hbm2java
 */

@Entity
@Table(name = "order")
public class Orders implements java.io.Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "productid")
    private int prductid;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "amount")
    private int amount;

    @Column(name = "description")
    private String description;

    public Orders() {
    }

    public Orders(int prductid, int quantity, int amount) {
        this.prductid = prductid;
        this.quantity = quantity;
        this.amount = amount;
    }

    public Orders(int prductid, int quantity, int amount, String description) {
        this.prductid = prductid;
        this.quantity = quantity;
        this.amount = amount;
        this.description = description;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPrductid() {
        return this.prductid;
    }

    public void setPrductid(int prductid) {
        this.prductid = prductid;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}