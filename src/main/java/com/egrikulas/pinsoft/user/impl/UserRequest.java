package com.egrikulas.pinsoft.user.impl;

import com.egrikulas.pinsoft.user.api.UserDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean status;

    public UserDto toDto(){
        return UserDto.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .password(password)
                .status(status)
                .build();
    }

}
