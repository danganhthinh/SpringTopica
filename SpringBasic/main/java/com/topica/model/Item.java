package com.topica.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author thinh
 */
@Entity
public class Item {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToMany()
    @JoinTable(name = "itemcategory", joinColumns = @JoinColumn(name = "itemid"), inverseJoinColumns = @JoinColumn(name = "categoryid"))
    private List<Category> cate = new ArrayList<>();

    public Item() {

    }

    public Item(String name) {
        this.name = name;
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
}
