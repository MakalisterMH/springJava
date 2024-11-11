package com.springjava.dslist.dto;

import com.springjava.dslist.entities.Game;

public class GameMinDTO {
    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }

    public GameMinDTO(Game Entity) {
        this.id = Entity.getId();
        this.title = Entity.getTitle();
        this.year = Entity.getYear();
        this.imgUrl = Entity.getImgUrl();
        this.shortDescription = Entity.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }


    

}
