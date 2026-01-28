package behaviouralDesignPattern.chainOfresponsibiltity;

abstract class LeaveHandler {
    LeaveHandler nextLeaveHandler;
    public LeaveHandler (){
        this.nextLeaveHandler = null;
    }
    void setNextLeaveHandler(LeaveHandler next){
        this.nextLeaveHandler = next;
    }
    abstract void approve(int days);
}

class TeamLead extends LeaveHandler{

    @Override
    void approve(int days) {
        if(days <= 2){
            System.out.println("The leave is approved by team Lead");
        }
        else{
            System.out.println("Team lead forwarded it to Manager");
            nextLeaveHandler.approve(days);
        }
    }
}

class Manager extends LeaveHandler{

    @Override
    void approve(int days) {
        if(days > 2 && days <= 5){
            System.out.println("The leave is approved by Manager");
        }
        else{
            System.out.println("Manager forwarded it to Principal Manager");
            nextLeaveHandler.approve(days);

        }
    }
}

class PrincipalManager extends LeaveHandler{
    @Override
    void approve(int days) {
        System.out.println("The leave is approved by Manager");
    }
}

public class LeaveRequestSystem {
    public static void main(String[] args) {
        LeaveHandler teamLead = new TeamLead();
        LeaveHandler manager = new Manager();
        LeaveHandler principalManager = new PrincipalManager();
        teamLead.setNextLeaveHandler(manager);
        manager.setNextLeaveHandler(principalManager);

        teamLead.approve(20);

    }
}
