package br.com.scoringapp.profilemicro.user.service;

import java.util.List;

import br.com.scoringapp.profilemicro.user.model.User;
import br.com.scoringapp.profilemicro.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }
}
