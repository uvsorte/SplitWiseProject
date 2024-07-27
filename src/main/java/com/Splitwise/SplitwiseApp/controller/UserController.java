package com.Splitwise.SplitwiseApp.controller;


import com.Splitwise.SplitwiseApp.Mapper.entityDTOMapper.EntityDTOMapper;
import com.Splitwise.SplitwiseApp.dto.UserRegistrationDTO;
import com.Splitwise.SplitwiseApp.entity.User;
import com.Splitwise.SplitwiseApp.exceptions.UserRegistrattionInvalidDataException;
import com.Splitwise.SplitwiseApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody UserRegistrationDTO userRegistrationDTO){
        validateUserRegistrationRequestDTO(userRegistrationDTO);
        User savedUser = userService.signUp(userRegistrationDTO.getName(),userRegistrationDTO.getEmail(),userRegistrationDTO.getPassword());
        return ResponseEntity.ok(
                EntityDTOMapper.toDTO(savedUser)
        );
    }

    private void validateUserRegistrationRequestDTO(UserRegistrationDTO requestDTO){
        //do both in regex
        //validate if the email is Proper
        //validate if password has atleast 8 characters includng a small,cap,numeric and Special Char
        if(requestDTO.getEmail() == null || requestDTO.getPassword() == null || requestDTO.getName() == null){
            throw new UserRegistrattionInvalidDataException("Invalid signUp!!");
        }

    }
}
