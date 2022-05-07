package patterns.behavioural.chainOfResponsibility.handlers;

public class SecondLevelSupportHandler extends SupportHandler {

    public SecondLevelSupportHandler() {
        super(new TechnicalSupportHandler());
    }

    @Override
    protected boolean canHandleRequest(SupportRequest supportRequest) {
        return supportRequest.equals(SupportRequest.ACCOUNT_OPENING);
    }

    @Override
    public void handle(SupportRequest supportRequest) {
        if (canHandleRequest(supportRequest)) {
            System.out.println("Second Level Support: Handling " + supportRequest);
        } else {
            System.out.println("Second Level Support: Forwarding " + supportRequest);
            super.handle(supportRequest);
        }
    }

}
