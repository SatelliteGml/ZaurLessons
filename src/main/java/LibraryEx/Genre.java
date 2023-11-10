package LibraryEx;

import lombok.Getter;

@Getter
public enum Genre {
    NOVEL(1,"Роман"),
    SCIENCE_FICTION(2,"Фантастика"),
    DETECTIVE(3,"Детектив"),
    HISTORICAL(4,"Исторический"),
    POETRY(5,"Поэзия");

    private final int id;
    private final String description;

    Genre(int id, String description) {
        this.id = id;
        this.description = description;
    }
    public void displayDetails() {
        System.out.println("Genre ID: " + id);
        System.out.println("Name: " + description);
    }
}
