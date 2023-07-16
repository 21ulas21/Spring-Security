package com.egrikulas.pinsoft.authentication.api;

import com.egrikulas.pinsoft.authentication.impl.AuthenticationRequest;
import com.egrikulas.pinsoft.authentication.impl.AuthenticationResponse;
import com.egrikulas.pinsoft.user.api.UserDto;
import com.egrikulas.pinsoft.user.impl.UserRequest;

public interface AuthenticationService {

    AuthenticationResponse login(AuthenticationRequest request);
    UserDto register(UserRequest request);

}
