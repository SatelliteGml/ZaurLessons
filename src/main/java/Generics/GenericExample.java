package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List<DepositAccount> depositAccounts = new ArrayList<>();
        depositAccounts.add(new DepositAccount(1, "Zaur", "12345"));
        depositAccounts.add(new DepositAccount(2, "Artur", "q123"));

        Collections.sort(depositAccounts);
        System.out.println(depositAccounts);

    }
}
