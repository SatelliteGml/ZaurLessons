package Generics;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public abstract class BankAccount implements Comparable<BankAccount>{
    private int id;
    private String name;
    private String password;

    public BankAccount(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public int compareTo(BankAccount o) {
        int res = this.id-o.id;
        if (res == 0){
            res = this.name.compareTo(o.name);
        }
        return res;
    }
}
