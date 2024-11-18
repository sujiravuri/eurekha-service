package com.practice.UserService.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private int userId;
    private String userName;
    private String userPassword;
    private String address;
    private String city;

}
