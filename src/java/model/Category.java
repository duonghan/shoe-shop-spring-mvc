package model;
// Generated Apr 6, 2017 12:29:42 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CollectionId;




/**
 * Category generated by hbm2java
 */

@Entity
@Table(name = "category")
public class Category  implements java.io.Serializable {

     @Id
     @GeneratedValue
     @Column(name = "id")
     private Integer id;
     
     @Column(name = "name")
     private String name;

    public Category() {
    }

    public Category(String name) {
       this.name = name;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


