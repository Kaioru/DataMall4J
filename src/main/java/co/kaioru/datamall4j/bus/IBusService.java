package co.kaioru.datamall4j.bus;

import java.util.Set;

public interface IBusService {

    int getServiceNumber();

    BusServiceStatus getStatus();

    BusServiceOperator getOperator();

    IBusStop getOriginatingStop();

    IBusStop getTerminatingStop();

    Set<IBus> getBuses();

}
