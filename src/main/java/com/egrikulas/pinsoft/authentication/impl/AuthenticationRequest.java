package com.egrikulas.pinsoft.authentication.impl;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationRequest {

    private String email;
    private String password;
}