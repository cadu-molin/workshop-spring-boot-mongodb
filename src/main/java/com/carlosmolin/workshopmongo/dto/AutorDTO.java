package com.carlosmolin.workshopmongo.dto;

import com.carlosmolin.workshopmongo.domain.User;

import java.io.Serializable;

public class AutorDTO implements Serializable {

    private String id;
    private String name;

    public AutorDTO() {}

    public AutorDTO(User autor) {
        this.id = autor.getId();
        this.name = getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
