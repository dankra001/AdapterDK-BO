package org.example;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Requirements {
    private final Integer gpuGb;
    private final Integer HDDGb;
    private final Integer RAMGb;
    private final Double cpuGhz;
    private final Integer coresNum;
}
