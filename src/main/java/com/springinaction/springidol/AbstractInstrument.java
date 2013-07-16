package com.springinaction.springidol;

/**
 * @author YNaidyon
 * @since 16.07.13
 */
public abstract class AbstractInstrument implements Instrument {
    @Override
    public void play() {
        System.out.println(getSound());
    }

    @Override
    public abstract String getSound();
}
