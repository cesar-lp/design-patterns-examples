package patterns.structural.proxy.proxy;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import patterns.structural.proxy.role.UserRole;
import patterns.structural.proxy.session.Session;
import patterns.structural.proxy.session.SessionService;
import patterns.structural.proxy.session.SessionServiceImpl;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SessionProxy implements SessionService {

    final SessionService sessionService;
    final UserRole currentRole;

    public SessionProxy(UserRole userRole) {
        sessionService = new SessionServiceImpl();
        currentRole = userRole;
    }

    @Override
    public void createSession(Session session) {
        sessionService.createSession(session);
    }

    @Override
    public void refreshSession(String id) {
        sessionService.refreshSession(id);
    }

    @Override
    public void deleteSession(String id) throws Exception {
        if (currentRole != UserRole.ADMIN) {
            throw new IllegalAccessException("Session proxy: cannot delete session with role " + currentRole);
        }

        sessionService.deleteSession(id);
    }
}
