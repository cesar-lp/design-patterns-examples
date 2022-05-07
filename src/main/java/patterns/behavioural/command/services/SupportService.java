package patterns.behavioural.command.services;

import java.util.Map;

public class SupportService implements OrderActions {

    @Override
    public void updateOrder(String orderId, Map<String, Object> updateData) {
        System.out.println("Support: executing call from support-service in order to update order " + orderId);
    }

    @Override
    public void cancelOrder(String orderId, Map<String, Object> cancellationData) {
        System.out.println("Support: executing call from support-service in order to cancel order " + orderId);
    }
}
