package br.com.scoringapp.profilemicro.user.model;

import java.io.Serializable;
import java.util.List;

import br.com.scoringapp.profilemicro.address.model.Address;
import br.com.scoringapp.profilemicro.debts.model.Debts;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "profile")
public class User implements Serializable {

    private static final long serialVersionUID = -2241805334368530969L;

    @Id
    private String id;
    private String name;
    private String cpf;
    private List<Debts> debts;
    private List<Address> address;
}