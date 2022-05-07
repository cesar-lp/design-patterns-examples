package patterns.behavioural.chainOfResponsibility.handlers;

public class TechnicalSupervisorSupportHandler extends SupportHandler {

    public TechnicalSupervisorSupportHandler() {
        super(null);
    }

    @Override
    protected boolean canHandleRequest(SupportRequest supportRequest) {
        return true;
    }

    @Override
    public void handle(SupportRequest supportRequest) {
        System.out.println("Technical Supervisor: Handling " + supportRequest);
    }
}
