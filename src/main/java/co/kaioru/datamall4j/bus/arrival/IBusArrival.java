package co.kaioru.datamall4j.bus.arrival;

import co.kaioru.datamall4j.bus.IBusService;
import co.kaioru.datamall4j.bus.IBusStop;

import java.util.Set;

public interface IBusArrival {

    Set<IBusService> getServices();

    IBusStop getStop();

}
