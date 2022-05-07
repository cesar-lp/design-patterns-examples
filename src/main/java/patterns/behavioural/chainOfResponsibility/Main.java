package patterns.behavioural.chainOfResponsibility;

import patterns.behavioural.chainOfResponsibility.handlers.EntryLevelSupportHandler;
import patterns.behavioural.chainOfResponsibility.handlers.SupportRequest;

public class Main {

    public static void main(String[] args) {
        var handler = new EntryLevelSupportHandler();

        handler.handle(SupportRequest.GENERAL_HELP);
        System.out.println();

        handler.handle(SupportRequest.ACCOUNT_OPENING);
        System.out.println();

        handler.handle(SupportRequest.API_INTEGRATION);
        System.out.println();

        handler.handle(SupportRequest.FEATURE_REQUEST);
    }

}
