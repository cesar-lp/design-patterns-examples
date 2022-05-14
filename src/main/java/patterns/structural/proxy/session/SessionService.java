package patterns.structural.proxy.session;

public interface SessionService {

    void createSession(Session session);

    void refreshSession(String id);

    void deleteSession(String id) throws Exception;

}
