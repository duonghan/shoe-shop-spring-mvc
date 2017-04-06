package model;
// Generated Apr 6, 2017 12:29:42 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * Transaction generated by hbm2java
 */
@Entity
@Table(name = "transaction")
public class Transaction  implements java.io.Serializable {

     @Id
     @GeneratedValue
     @Column(name = "id")
     private Integer id;
     
     @Column(name = "status")
     private boolean status;
     
     @Column(name = "userid")
     private int userid;
     
     @Column(name = "amount")
     private int amount;
     
     @Column(name = "payment")
     private String payment;
     
     @Column(name = "paymentinfo")
     private String paymentinfo;
     
     @Column(name = "message")
     private String message;
     
     @Column(name = "created")
     @Temporal(javax.persistence.TemporalType.DATE)
     private Date created;
     
     @Column(name = "image")
     private String image;

    public Transaction() {
    }

    public Transaction(boolean status, int userid, int amount, String payment, String paymentinfo, String message, Date created, String image) {
       this.status = status;
       this.userid = userid;
       this.amount = amount;
       this.payment = payment;
       this.paymentinfo = paymentinfo;
       this.message = message;
       this.created = created;
       this.image = image;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public boolean isStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    public int getUserid() {
        return this.userid;
    }
    
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getAmount() {
        return this.amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getPayment() {
        return this.payment;
    }
    
    public void setPayment(String payment) {
        this.payment = payment;
    }
    public String getPaymentinfo() {
        return this.paymentinfo;
    }
    
    public void setPaymentinfo(String paymentinfo) {
        this.paymentinfo = paymentinfo;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }




}

