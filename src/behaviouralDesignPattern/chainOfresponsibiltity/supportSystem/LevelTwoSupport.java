package behaviouralDesignPattern.chainOfresponsibiltity.supportSystem;

public class LevelTwoSupport extends SupportHandler{

    @Override
    public void handleRequest(String issue) {
        if(issue.contains("intermediate")){
            System.out.println("Level Two Support handled the issue: " + issue);
        }
        else{
            if(nextHandler != null){
                System.out.println("Level Two Support forwarding the issue to Level Three Support: " + issue);
                nextHandler.handleRequest(issue);
            }
            else{
                System.out.println("No handler available for the issue: " + issue);
            }
        }
    }
}
