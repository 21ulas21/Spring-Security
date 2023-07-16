package com.egrikulas.pinsoft.user.api;

import com.egrikulas.pinsoft.user.impl.UserRequest;

public interface UserService {
    UserDto getUserById(String id);
    UserDto updateUser(String id, UserDto dto);
}
