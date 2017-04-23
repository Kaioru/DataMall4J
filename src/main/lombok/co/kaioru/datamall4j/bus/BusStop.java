package co.kaioru.datamall4j.bus;

import lombok.Getter;

@Getter
public class BusStop implements IBusStop {

    private final int id;

    public BusStop(int id) {
        this.id = id;
    }

}
