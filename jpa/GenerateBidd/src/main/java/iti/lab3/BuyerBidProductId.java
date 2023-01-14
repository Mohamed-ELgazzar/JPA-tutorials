package iti.lab3;
// Generated Jan 8, 2023, 12:01:09 AM by Hibernate Tools 6.1.6.Final


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * BuyerBidProductId generated by hbm2java
 */
@Embeddable
public class BuyerBidProductId  implements java.io.Serializable {


     private int buyerId;
     private int productId;

    public BuyerBidProductId() {
    }

    public BuyerBidProductId(int buyerId, int productId) {
       this.buyerId = buyerId;
       this.productId = productId;
    }
   


    @Column(name="buyer_id", nullable=false)
    public int getBuyerId() {
        return this.buyerId;
    }
    
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }


    @Column(name="product_id", nullable=false)
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BuyerBidProductId) ) return false;
		 BuyerBidProductId castOther = ( BuyerBidProductId ) other; 
         
		 return (this.getBuyerId()==castOther.getBuyerId())
 && (this.getProductId()==castOther.getProductId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getBuyerId();
         result = 37 * result + this.getProductId();
         return result;
   }   


}


