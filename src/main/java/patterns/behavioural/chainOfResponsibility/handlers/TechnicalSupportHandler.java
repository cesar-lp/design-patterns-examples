package patterns.behavioural.chainOfResponsibility.handlers;

public class TechnicalSupportHandler extends SupportHandler {

    public TechnicalSupportHandler() {
        super(new TechnicalSupervisorSupportHandler());
    }


    @Override
    protected boolean canHandleRequest(SupportRequest supportRequest) {
        return supportRequest.equals(SupportRequest.API_INTEGRATION);
    }

    @Override
    public void handle(SupportRequest supportRequest) {
        if (canHandleRequest(supportRequest)) {
            System.out.println("Technical Support: Handling " + supportRequest);
        } else {
            System.out.println("Technical Support: Forwarding " + supportRequest);
            super.handle(supportRequest);
        }
    }
}
