package com.springinaction.springidol;

import java.util.Collection;

/**
 * @author YNaidyon
 * @since 15.07.13
 */
public class OneManBand implements Performer {

    @Override
    public void perform() throws PerformanceException {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
