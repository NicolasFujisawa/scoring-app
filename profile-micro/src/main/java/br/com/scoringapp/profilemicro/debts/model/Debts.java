package br.com.scoringapp.profilemicro.debts.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Debts implements Serializable {

    private static final long serialVersionUID = 8033168289907293824L;

    String amount;

    Long creditorId;
}
