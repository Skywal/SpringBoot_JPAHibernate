package com.bloom.mvcspring.tut.DAO;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    //region fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;
    //endregion

    //region get/set
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //endregion
}
/*Hibernate автоматично перетворить цей клас на таблицю у базі даних тому у .properties файлі потрібно виставити
* spring.jpa.hibernate.ddl-auto=update або create при першому запуску. Далі виставити або update або по-дефолту none */