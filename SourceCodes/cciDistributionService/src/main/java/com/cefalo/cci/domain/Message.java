package com.cefalo.cci.domain;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: Nadim
 * Date: 2/14/13
 * Time: 9:12 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "message")
///@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Message {
    private int id;
    private String text;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
