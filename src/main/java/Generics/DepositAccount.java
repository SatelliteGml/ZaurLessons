package Generics;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositAccount extends BankAccount{
    public DepositAccount(int id, String name, String password) {
        super(id, name, password);
    }

}
