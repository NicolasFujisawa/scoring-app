package br.com.scoringapp.profilemicro.user.repository;

import br.com.scoringapp.profilemicro.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User findByCpf(String cpf);
}
