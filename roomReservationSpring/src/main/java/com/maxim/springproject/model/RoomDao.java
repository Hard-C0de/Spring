package com.maxim.springproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter

@Setter

@AllArgsConstructor

@NoArgsConstructor //пустые конструкторы

@Entity
@Table(name = "room")
public class RoomDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//автоматическая обработка id
    private long id;
    @Column
    private String name;
    @Column
    private int size;
    @Column
    @Range(min = 1 , max = 10,message = "В здании 10 этажей")
    private int floor;
    @Column(name = "available")
    private boolean available;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
