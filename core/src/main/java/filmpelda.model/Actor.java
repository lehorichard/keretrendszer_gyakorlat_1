package filmpelda.model;

import filmpelda.exeption.DateIsTooLate;

import java.time.LocalDate;

public class Actor extends Human {
    private String character_name;

    public Actor(String character_name) {
        this.character_name = character_name;
    }

    public Actor(String firstName, String lastName, LocalDate birthDate, String character_name) throws DateIsTooLate {
        super(firstName, lastName, birthDate);
        this.character_name = character_name;
    }

    public Actor(){

    }

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }
}
