package behaviouralDesignPattern.chainOfresponsibiltity.supportSystem;

public class LevelOneSupport extends SupportHandler{
    @Override
    public void handleRequest(String issue) {
        if(issue.contains("simple")){
            System.out.println("Level One Support handled the issue: " + issue);
        }
        else{
            if(nextHandler != null){
                System.out.println("Level One Support forwarding the issue to Level Two Support: " + issue);
                nextHandler.handleRequest(issue);
            }
            else{
                System.out.println("No handler available for the issue: " + issue);
            }
        }
    }
}
