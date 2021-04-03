package br.com.scoringapp.profilemicro.user.service;

import java.util.List;

import br.com.scoringapp.profilemicro.user.model.User;

public interface UserService {
    User save(User user);

    List<User> findAll();
}
