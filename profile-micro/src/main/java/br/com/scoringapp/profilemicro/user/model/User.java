package br.com.scoringapp.profilemicro.user.model;

import java.util.List;

import br.com.scoringapp.profilemicro.address.model.Address;
import br.com.scoringapp.profilemicro.debts.model.Debts;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {

    @Id
    private String id;
    private String name;
    private String cpf;
    private List<Debts> debts;
    private Address address;
}