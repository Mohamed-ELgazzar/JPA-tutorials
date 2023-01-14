package iti.lab3;
// Generated Jan 8, 2023, 12:01:09 AM by Hibernate Tools 6.1.6.Final


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

/**
 * BuyerBuyProduct generated by hbm2java
 */
@Entity
@Table(name="buyer_buy_product"
    ,catalog="biddingschema"
)
public class BuyerBuyProduct  implements java.io.Serializable {


     private BuyerBuyProductId id;
     private Buyer buyer;
     private Product product;
     private Date paymentDate;
     private float amount;
     private int quantity;

    public BuyerBuyProduct() {
    }
   

    public BuyerBuyProduct(BuyerBuyProductId id, Buyer buyer, Product product, Date paymentDate, float amount, int quantity) {
       this.id = id;
       this.buyer = buyer;
       this.product = product;
       this.paymentDate = paymentDate;
       this.amount = amount;
       this.quantity = quantity;
    }
   
     
    @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="buyerId", column=@Column(name="buyer_id", nullable=false) ), 
        @AttributeOverride(name="productId", column=@Column(name="product_id", nullable=false) ) } )
    public BuyerBuyProductId getId() {
        return this.id;
    }
    
    public void setId(BuyerBuyProductId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="buyer_id", nullable=false, insertable=false, updatable=false)
    public Buyer getBuyer() {
        return this.buyer;
    }
    
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_id", nullable=false, insertable=false, updatable=false)
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="payment_date", nullable=false, length=10)
    public Date getPaymentDate() {
        return this.paymentDate;
    }
    
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    
    @Column(name="amount", nullable=false, precision=12, scale=0)
    public float getAmount() {
        return this.amount;
    }
    
    public void setAmount(float amount) {
        this.amount = amount;
    }

    
    @Column(name="quantity", nullable=false)
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




}


