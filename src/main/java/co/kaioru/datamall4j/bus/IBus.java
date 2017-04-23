package co.kaioru.datamall4j.bus;

import java.util.Set;

public interface IBus {

    IBusLocation getLocation();

    BusLoad getLoad();

    Set<BusFeature> getFeatures();

}
