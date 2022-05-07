package patterns.behavioural.command;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import patterns.behavioural.command.commands.CancelOrderCommand;
import patterns.behavioural.command.commands.UpdateOrderCommand;
import patterns.behavioural.command.services.SupportService;
import patterns.behavioural.command.services.UserService;

import java.util.HashMap;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Main {

    static final SupportService supportService = new SupportService();
    static final UserService userService = new UserService();
    static final String orderId = "123e4567-e89b-12d3-a456-426614174000";

    public static void main(String[] args) {
        handleUpdateOrderRequest();

        System.out.println();

        handleCancelOrderRequest();
    }

    private static void handleUpdateOrderRequest() {
        var updateOrderBySupport = new UpdateOrderCommand(supportService);
        var updateOrderByUser = new UpdateOrderCommand(userService);

        var updateData = new HashMap<String, Object>();
        updateData.put("delivery_comment", "Please be sure to knock the door (bell doesn't work)");

        // an HTTP call is made to this service requesting an update of an order by the user
        updateOrderByUser.execute(orderId, updateData);

        // user can't update order, therefore support does it
        updateOrderBySupport.execute(orderId, updateData);
    }

    private static void handleCancelOrderRequest() {
        var cancelOrderBySupport = new CancelOrderCommand(supportService);
        var cancelOrderByUser = new CancelOrderCommand(userService);

        var cancellationData = new HashMap<String, Object>();
        cancellationData.put("reason", "Order didn't arrive after waiting for a whole hour.");

        // an HTTP call is made to this service requesting the cancellation of the order by the user
        cancelOrderByUser.execute(orderId, cancellationData);

        // user can't cancel order, therefore support does it
        cancelOrderBySupport.execute(orderId, cancellationData);
    }

}
