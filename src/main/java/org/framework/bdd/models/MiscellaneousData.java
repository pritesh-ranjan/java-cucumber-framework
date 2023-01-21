package org.framework.bdd.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MiscellaneousData {
    private int year;
    private Double price;
    private CPU cpuModel;
    private String hardDiskSize;
}
