package patterns.structural.proxy.session;

public class SessionServiceImpl implements SessionService {

    @Override
    public void createSession(Session session) {
        System.out.println("Session service: creating session");
    }

    @Override
    public void refreshSession(String id) {
        System.out.println("Session service: refreshing session " + id);
    }

    @Override
    public void deleteSession(String id) {
        System.out.println("Session service: deleting session " + id);
    }
}
