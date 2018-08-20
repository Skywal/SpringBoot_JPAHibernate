package com.bloom.mvcspring.tut.DAO;

import javax.persistence.*;

/**
 * https://habr.com/post/248541/
 */

@Entity
@Table(name = "USER")
public class User{

    //region fields
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
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