package co.kaioru.datamall4j.bus.arrival;

import co.kaioru.datamall4j.bus.*;
import lombok.Getter;
import org.json.JSONObject;

import java.util.HashSet;
import java.util.Set;

@Getter
public class BusArrival implements IBusArrival {

    private final IBusStop stop;
    private final Set<IBusService> services;

    public BusArrival(JSONObject object) {
        this.stop = new BusStop(object.getInt("BusStopID"));

        this.services = new HashSet<>();
        object.getJSONArray("Services").forEach(o -> {
            if (o instanceof JSONObject)
                this.services.add(new BusService((JSONObject) o));
        });
    }

}
