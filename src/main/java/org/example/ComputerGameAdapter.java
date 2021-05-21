package org.example;

import lombok.AllArgsConstructor;


@AllArgsConstructor

public class ComputerGameAdapter implements PCGame {

    private final ComputerGame computerGame;


    @Override
    public String getTitle() {
        return computerGame.getName();
    }

    @Override
    public Integer getPegiAllowedAge() {
        return convertPegiAgeToInt(computerGame.getPegiAgeRating());

    }

    @Override
    public boolean isTripleAGame() {
       return computerGame.getBudgetInMillionsOfDollars() > 50;
    }

    @Override
    public Requirements getRequirements() {
        return Requirements
                .builder()
                .coresNum(computerGame.getCoresNeeded())
                .cpuGhz(computerGame.getCoreSpeedInGhz())

                .gpuGb(Math.round(
                        (float) computerGame.getMinimumGpuMemoryInMegabytes()/1024))

                .HDDGb(computerGame.getDiskSpaceNeededInGB())
                .RAMGb(computerGame.getRamNeededInGb())
                .build();
    }


    private Integer convertPegiAgeToInt(PegiAgeRating pegiAgeRating){
        return Integer.parseInt(
                pegiAgeRating.toString().substring(1)
        );

    }
}
