package co.kaioru.datamall4j.bus;

import lombok.Getter;
import org.json.JSONObject;

import java.util.Set;

@Getter
public class Bus implements IBus {

    private final IBusLocation location;
    private final BusLoad load;
    private final Set<BusFeature> features;

    public Bus(JSONObject object) {
        this.location = null;
        this.load = null;
        this.features = null;
    }

}
