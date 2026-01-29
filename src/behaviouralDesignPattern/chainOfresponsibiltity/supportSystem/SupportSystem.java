package behaviouralDesignPattern.chainOfresponsibiltity.supportSystem;

import java.util.Arrays;

public class SupportSystem {
    public static void main(String[] args) {
        SupportHandler levelOne = new LevelOneSupport();
        SupportHandler levelTwo = new LevelTwoSupport();
        SupportHandler specialist = new TechnicalSpecialist();

        levelOne.setNextHandler(levelTwo);
        levelTwo.setNextHandler(specialist);

        String[] issues = {
            "simple password reset",
            "intermediate software installation",
            "complex network configuration",
            "imocha assessment issue"
        };

//        for (String issue : issues) {
//            System.out.println("\nNew Issue: " + issue);
//            levelOne.handleRequest(issue);
//        }

        Arrays.stream(issues).forEach(
            (issue) -> {
                System.out.println("\nNew Issue: " + issue);
                levelOne.handleRequest(issue);
            });

    }
}
