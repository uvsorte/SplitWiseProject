package com.Splitwise.SplitwiseApp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserLoginResponseDTO {
    private String name;
    private int id;
    private String email;
    private List<UserFriendResponseDTO> friendList;

    private List<GroupResponseDTO> groups;

    public List<GroupResponseDTO> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupResponseDTO> groupResponseDTOS) {
        this.groups = groupResponseDTOS;
    }

    public List<UserFriendResponseDTO> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<UserFriendResponseDTO> friendList) {
        this.friendList = friendList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
