package com.springinaction.springidol;

import java.util.Map;

/**
 * @author YNaidyon
 * @since 15.07.13
 */
public class OneManBandWithMap implements Performer {
    @Override
    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            System.out.println(instruments.get(key));
        }
    }

    private Map<String, String> instruments;

    public void setInstruments(Map<String, String> instruments) {
        this.instruments = instruments;
    }
}
