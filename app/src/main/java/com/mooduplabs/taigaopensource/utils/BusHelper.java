package com.mooduplabs.taigaopensource.utils;

import de.halfbit.tinybus.Bus;
import de.halfbit.tinybus.TinyBus;

public class BusHelper {

    private static final Bus BUS = new TinyBus();

    private BusHelper() {
    }

    public static Bus getInstance() {
        return BUS;
    }
}