package org.framework.bdd.utils;

import org.aeonbits.owner.ConfigFactory;

public class ConfigurationFactory {
    public static FrameworkConfiguration getConfig() {
        return ConfigFactory.create(FrameworkConfiguration.class);
    }
}
