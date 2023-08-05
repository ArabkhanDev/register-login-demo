package com.sbsecurity.registerloginpagedemo.user;


import com.sbsecurity.registerloginpagedemo.registration.RegistrationRequest;
import com.sbsecurity.registerloginpagedemo.registration.token.VerificationToken;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> getUsers();
    User registerUser(RegistrationRequest request);
    Optional<User> findByEmail(String email);

    void saveUserVerificationToken(User theUser, String verificationToken);

    String validateToken(String theToken);

    VerificationToken generateNewVerificationToken(String oldToken);
}
