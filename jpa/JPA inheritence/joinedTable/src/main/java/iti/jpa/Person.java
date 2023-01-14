package iti.jpa;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType. JOINED)
public abstract class Person {
@Id
@GeneratedValue (strategy = GenerationType. IDENTITY)
    protected Integer id;
    // @NotNull
    protected String first_name;
    // @NotNull
    protected String last_name;

    // protected String person_type;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }



}
