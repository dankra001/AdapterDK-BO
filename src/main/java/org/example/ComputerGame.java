package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ComputerGame {

    private final String name;
    private final PegiAgeRating pegiAgeRating;
    private final Double budgetInMillionsOfDollars;
    private final Integer minimumGpuMemoryInMegabytes;
    private final Integer diskSpaceNeededInGB;
    private final Integer ramNeededInGb;
    private final Integer coresNeeded;
    private final Double coreSpeedInGhz;
}

