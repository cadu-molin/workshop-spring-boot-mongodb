package com.carlosmolin.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

    String text;
    Date date;
    AutorDTO author;

    public CommentDTO() {}

    public CommentDTO(String text, Date date, AutorDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AutorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AutorDTO author) {
        this.author = author;
    }
}
