package com.springinaction.springidol;

/**
 * @author YNaidyon
 * @since 6/4/13
 */
public class Sonnet29 implements Poem {
    private static final String[] LINES = {
            "When, in disgrace with fortune and men's eyes" };
    public Sonnet29() {}

    @Override
    public void recite() {
        for (String LINE : LINES) {
            System.out.println(LINE);
        }
    }
}
