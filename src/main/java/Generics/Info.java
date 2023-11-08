package Generics;

import lombok.Data;

import java.util.List;

@Data
public class Info <T extends BankAccount>{
    private List<T>list;

    public Info(List<T> list) {
        this.list = list;
    }
}
