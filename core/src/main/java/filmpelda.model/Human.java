package filmpelda.model;

import filmpelda.exeption.DateIsTooLate;

import java.time.LocalDate;

public class Human {


    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Human() {
    }

    public Human(String firstName, String lastName, LocalDate birthDate) throws DateIsTooLate {
        this.firstName = firstName;
        this.lastName = lastName;
        setBirthDate(birthDate);
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) throws DateIsTooLate {
        if(!birthDate.isBefore(LocalDate.now())) {
            throw new DateIsTooLate(birthDate.toString());
        }
        this.birthDate = birthDate;

    }
}
