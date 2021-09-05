package newcurd.newcurd.model;

import javax.persistence.*;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    private int id;

    @Column(name ="Name")
    private String name;

    @Column(name = "Email")
    private String email;

    @Column(name = "Age")
    private int age;

    public Person() {

    }

    public Person(int id, String name, String email, int age) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
