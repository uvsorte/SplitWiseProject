package com.Splitwise.SplitwiseApp.Mapper.entityDTOMapper;

import com.Splitwise.SplitwiseApp.dto.GroupResponseDTO;
import com.Splitwise.SplitwiseApp.dto.UserFriendResponseDTO;
import com.Splitwise.SplitwiseApp.dto.UserLoginResponseDTO;
import com.Splitwise.SplitwiseApp.entity.Group;
import com.Splitwise.SplitwiseApp.entity.User;

import java.util.ArrayList;
import java.util.List;

public class EntityDTOMapper {

    public static UserLoginResponseDTO toDTO(User user){
        UserLoginResponseDTO responseDTO = new UserLoginResponseDTO();
        responseDTO.setEmail(user.getEmail());
        responseDTO.setName(user.getName());
        responseDTO.setId(user.getId());
        //conversion of userFriends to FriendList
        List<UserFriendResponseDTO> friendList = new ArrayList<>();
        for(User friend : user.getFriends()){
            friendList.add(toFriendDTO(friend));
        }
        responseDTO.setFriendList(friendList);


        List<GroupResponseDTO> groups = new ArrayList<>();
        for(Group group : user.getGroups()){
            groups.add(toGroupDTO(group));
        }
        responseDTO.setGroups(groups);
        //conversion to group tp groupRresponseDTO

        return responseDTO;

    }

    public static UserFriendResponseDTO toFriendDTO(User user){
        UserFriendResponseDTO responseDTO = new UserFriendResponseDTO();
        responseDTO.setId(user.getId());
        responseDTO.setName(user.getName());
        return responseDTO;
    }

    public static GroupResponseDTO toGroupDTO(Group group){
        //groupResponseDTO.
        return null;
    }

}
