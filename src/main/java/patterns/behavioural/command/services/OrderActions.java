package patterns.behavioural.command.services;

import java.util.Map;

public interface OrderActions {

    void updateOrder(String orderId, Map<String, Object> updateData);

    void cancelOrder(String orderId, Map<String, Object> cancellationData);

}
