package com.maxim.springproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
@Entity // хранилище данных
@Table(name="employees")
public class EmoloyeeDao {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "position")
    private String position;

    public EmoloyeeDao(int id, String name, int age, String position) {
        this.id=id;
        this.name = name;
        this.age = age;
        this.position = position;
    }
}
