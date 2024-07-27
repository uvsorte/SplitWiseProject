package com.Splitwise.SplitwiseApp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserFriendResponseDTO {

    private int id;
    private String name;


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
