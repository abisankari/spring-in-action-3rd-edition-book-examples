package com.springinaction.springidol;

/**
 * @author YNaidyon
 * @since 6/4/13
 */
public class Stage {
    private Stage() {
    }

    private static class StageSingletonHolder {
        private static final Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
