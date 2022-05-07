package patterns.behavioural.chainOfResponsibility.handlers;

public class EntryLevelSupportHandler extends SupportHandler {

    public EntryLevelSupportHandler() {
        super(new SecondLevelSupportHandler());
    }

    @Override
    protected boolean canHandleRequest(SupportRequest supportRequest) {
        return supportRequest.equals(SupportRequest.GENERAL_HELP);
    }

    @Override
    public void handle(SupportRequest supportRequest) {
        if (canHandleRequest(supportRequest)) {
            System.out.println("Entry Level Support: Handling " + supportRequest);
        } else {
            System.out.println("Entry Level Support: Forwarding " + supportRequest);
            super.handle(supportRequest);
        }
    }
}
