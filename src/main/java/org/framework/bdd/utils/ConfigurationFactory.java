package org.framework.bdd.utils;

import lombok.experimental.UtilityClass;
import org.aeonbits.owner.ConfigFactory;

@UtilityClass
public class ConfigurationFactory {
    public static FrameworkConfiguration getConfig() {
        return ConfigFactory.create(FrameworkConfiguration.class);
    }
}
