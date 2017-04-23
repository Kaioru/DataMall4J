package co.kaioru.datamall4j;

import co.kaioru.datamall4j.bus.arrival.BusArrivalQuery;

public class DataMallAPI {

    private final String token;

    private DataMallAPI(String token) {
        this.token = token;
    }

    public static DataMallAPI create(String token) {
        return new DataMallAPI(token);
    }

    public BusArrivalQuery getBusArrivals(int busStopId) {
        return new BusArrivalQuery(token, busStopId);
    }

}
