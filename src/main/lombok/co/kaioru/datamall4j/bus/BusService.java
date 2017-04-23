package co.kaioru.datamall4j.bus;

import lombok.Getter;
import org.json.JSONObject;

import java.util.HashSet;
import java.util.Set;

@Getter
public class BusService implements IBusService {

    private final int serviceNumber;
    private final BusServiceStatus status;
    private final BusServiceOperator operator;
    private final IBusStop originatingStop, terminatingStop;
    private final Set<IBus> buses;

    public BusService(JSONObject object) {
        this.serviceNumber = object.getInt("ServiceNo");
        this.status = null;
        this.operator = null;
        this.originatingStop = new BusStop(object.getInt("OriginatingID"));
        this.terminatingStop = new BusStop(object.getInt("TerminatingID"));
        this.buses = new HashSet<>();
    }

}
