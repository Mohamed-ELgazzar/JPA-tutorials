package iti.jpa;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@
DiscriminatorValue ("TA")
public class Teacher extends Person {
    Date hire_date;

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }
  
    
}
