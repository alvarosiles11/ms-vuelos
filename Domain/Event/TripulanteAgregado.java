package Domain.Event;

import java.time.LocalDateTime;
import java.util.UUID;

import org.json.JSONObject;

import ShareKernel.core.DomainEvent;

public class TripulanteAgregado extends DomainEvent {

    public UUID Key;

    public String Descripcion; // cargo
    public JSONObject Personal;;

    public TripulanteAgregado(UUID key,String descripcion, JSONObject personal) {
        super(LocalDateTime.now());
        Key = key;
        Descripcion = descripcion;
        Personal = personal;
    }

    @Override
    public String toString() {
        return "\n[TRIPULANTE]: " + this.Descripcion + " - " + this.Personal.toString();
    }

}