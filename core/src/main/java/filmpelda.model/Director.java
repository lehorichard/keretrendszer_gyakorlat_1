package filmpelda.model;

import filmpelda.exeption.DateIsTooLate;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.time.LocalDate;

public class Director extends Human{
    private int number_of_films;

    public Director() {

    }

    public Director(String firstName, String lastName, LocalDate birthDate, int number_of_films) throws DateIsTooLate {
        super(firstName, lastName, birthDate);
        this.number_of_films = number_of_films;
    }

    public int getNumber_of_films() {
        return number_of_films;
    }
    public void setNumber_of_films(int number_of_films) throws InvalidValue {
        if(number_of_films<1){
            throw new InvalidValue();
        }
        this.number_of_films = number_of_films;
    }
}
