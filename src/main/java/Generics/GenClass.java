package Generics;

import lombok.Data;

import java.util.ArrayList;

@Data

public class GenClass<T> {
    private T value1;
    private T value2;

    public GenClass() {
    }

    public GenClass(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getElement(ArrayList<T> al) {
        return al.get(1);
    }
}
