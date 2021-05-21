package org.example;

public class Main {

    public static void main(String[] args) {

        ComputerGame computerGame =
                new ComputerGame("Gra1",
                        PegiAgeRating.P12,
                        20.,
                        2048,
                        14,
                        4,
                        2,
                        2.4);

        PCGame pcGame = new ComputerGameAdapter(computerGame);
        System.out.println("Computer game:\n"+computerGame+"\n\n\n"
                +
                "PCGAME:\n" +
                "getTitle: " + pcGame.getTitle() + "\n" +
                "getPegiAllowedAge: " + pcGame.getPegiAllowedAge() + "\n"+
                "isTripleAGame: " + pcGame.isTripleAGame() + "\n"+
                "getRequirements: " + pcGame.getRequirements() + "\n");
    }
}
