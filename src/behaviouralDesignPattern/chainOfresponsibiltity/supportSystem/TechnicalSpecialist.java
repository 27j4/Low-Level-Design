package behaviouralDesignPattern.chainOfresponsibiltity.supportSystem;

public class TechnicalSpecialist extends SupportHandler{

    @Override
    public void handleRequest(String issue) {
        if(issue.contains("complex")){
            System.out.println("Technical Specialist handled the issue: " + issue);
        }
        else{
            System.out.println("The issue could not be handled: " + issue);
        }
    }
}
