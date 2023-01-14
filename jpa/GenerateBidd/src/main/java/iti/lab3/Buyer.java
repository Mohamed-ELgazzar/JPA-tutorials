package iti.lab3;
// Generated Jan 8, 2023, 12:01:09 AM by Hibernate Tools 6.1.6.Final


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.util.HashSet;
import java.util.Set;

/**
 * Buyer generated by hbm2java
 */
@Entity
@Table(name="buyer"
    ,catalog="biddingschema"
    , uniqueConstraints = @UniqueConstraint(columnNames="user_id") 
)
public class Buyer  implements java.io.Serializable {


     private Integer id;
     private User user;
     private String value;
     private Set<BuyerBuyProduct> buyerBuyProducts = new HashSet<BuyerBuyProduct>(0);
     private Set<BuyerBidProduct> buyerBidProducts = new HashSet<BuyerBidProduct>(0);

    public Buyer() {
    }
    public Buyer(String value) {
        this.value = value;
    }

	
    public Buyer(User user, String value) {
        this.user = user;
        this.value = value;
    }
    public Buyer(User user, String value, Set<BuyerBuyProduct> buyerBuyProducts, Set<BuyerBidProduct> buyerBidProducts) {
       this.user = user;
       this.value = value;
       this.buyerBuyProducts = buyerBuyProducts;
       this.buyerBidProducts = buyerBidProducts;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", unique=true, nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="value", nullable=false, length=150)
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="buyer")
    public Set<BuyerBuyProduct> getBuyerBuyProducts() {
        return this.buyerBuyProducts;
    }
    
    public void setBuyerBuyProducts(Set<BuyerBuyProduct> buyerBuyProducts) {
        this.buyerBuyProducts = buyerBuyProducts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="buyer")
    public Set<BuyerBidProduct> getBuyerBidProducts() {
        return this.buyerBidProducts;
    }
    
    public void setBuyerBidProducts(Set<BuyerBidProduct> buyerBidProducts) {
        this.buyerBidProducts = buyerBidProducts;
    }




}

