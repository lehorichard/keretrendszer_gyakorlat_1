package filmpelda.service;

import filmpelda.exeption.DateIsTooLate;
import filmpelda.exeption.NoMatchingID;
import filmpelda.model.Actor;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.util.Collection;
import java.util.UUID;

public interface ActorService {
    public Collection<Actor> listAllSzereplo();
    public Actor getActor(UUID id);
    public void addActor(Actor actor) throws DateIsTooLate, InvalidValue;
    public void updateActor(Actor actor) throws DateIsTooLate, InvalidValue;
    public void deleteActor(Actor actor);
    public void deleteActor(UUID id) throws NoMatchingID;
}
