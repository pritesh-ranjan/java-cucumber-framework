package org.framework.bdd.models;

public enum CPU {
    INTEL_I9("Intel Core i9"),
    APPLE_M1("Apple Silicon M1");

    String cpuName;

    CPU(String cpuName) {
        this.cpuName = cpuName;
    }
}
