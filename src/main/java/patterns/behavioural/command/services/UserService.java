package patterns.behavioural.command.services;

import java.util.Map;

public class UserService implements OrderActions {

    @Override
    public void updateOrder(String orderId, Map<String, Object> updateData) {
        System.out.println("User: executing call from user-service in order to update order " + orderId);
    }

    @Override
    public void cancelOrder(String orderId, Map<String, Object> cancellationData) {
        System.out.println("User: executing call from user-service in order to cancel order " + orderId);
    }
}
