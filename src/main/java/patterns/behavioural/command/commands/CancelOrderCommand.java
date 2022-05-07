package patterns.behavioural.command.commands;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import patterns.behavioural.command.services.OrderActions;

import java.util.Map;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CancelOrderCommand extends OrderCommand {

    // supply the object responsible for the logic
    final OrderActions orderActions;

    @Override
    public void execute(String orderId, Map<String, Object> cancellationData) {
        orderActions.cancelOrder(orderId, cancellationData);

        // execute more logic regarding the cancellation of an order
    }

}
