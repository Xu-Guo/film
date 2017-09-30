package com.xu.entity;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.Date;

/**
 * Film entity
 */
@Entity
@Table(name="t_film")
public class Film {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length=200)
    private String name;

    @Column(length=500)
    private String title;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(length=300)
    private String imageName;

    private Integer hot; //1 hot, 0 not hot

    private Date publishDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
