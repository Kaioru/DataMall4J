package co.kaioru.datamall4j.bus.arrival;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.HttpRequest;
import org.json.JSONObject;

import java.util.HashSet;
import java.util.Set;

public class BusArrivalQuery implements IBusArrivalQuery {

    private final String token;
    private final int busStopId;
    private int busServiceNo = 0;

    public BusArrivalQuery(String token, int busStopId) {
        this.token = token;
        this.busStopId = busStopId;
    }

    public BusArrivalQuery ofService(int busServiceId) {
        this.busServiceNo = busServiceId;
        return this;
    }

    @Override
    public IBusArrival get() throws Exception {
        HttpRequest request =  Unirest.get("http://datamall2.mytransport.sg/ltaodataservice/BusArrival")
                .header("AccountKey", token)
                .queryString("BusStopID", busStopId);

        if (busServiceNo > 0)
            request.queryString("ServiceNo", busServiceNo);

        return new BusArrival(request.asJson().getBody().getObject());
    }

}
