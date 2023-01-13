package iti.jpa;


import jakarta.persistence.*;
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
// it can be concrete but in that case we will need table for it
public   class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator="testGenerator")
    @TableGenerator(table ="my_sequences",name="testGenerator")
    protected Integer id;
    // @NotNull

    protected String first_name;
    // @NotNull

    protected String last_name;

    protected String person_type;

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

    public String getPerson_type() {
        return person_type;
    }

    public void setPerson_type(String person_type) {
        this.person_type = person_type;
    }

}
