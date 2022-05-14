package patterns.structural.proxy;

import patterns.structural.proxy.proxy.SessionProxy;
import patterns.structural.proxy.role.UserRole;
import patterns.structural.proxy.session.Session;
import patterns.structural.proxy.session.SessionService;

import java.util.UUID;

public class Main {

    private static SessionService sessionService;

    public static void main(String[] args) {
        sessionService = new SessionProxy(UserRole.USER);

        var sessionId = UUID.randomUUID().toString();
        var processId = UUID.randomUUID().toString();

        sessionService.createSession(new Session(processId));
        sessionService.refreshSession(sessionId);
        deleteSession(sessionId);

        sessionService = new SessionProxy(UserRole.ADMIN);
        deleteSession(sessionId);
    }

    private static void deleteSession(String sessionId) {
        try {
            sessionService.deleteSession(sessionId);
        } catch (Exception e) {
            System.out.printf("Error: %s\n", e.getMessage());
        }
    }
}
