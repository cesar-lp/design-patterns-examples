package patterns.behavioural.command.commands;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import patterns.behavioural.command.services.OrderActions;

import java.util.Map;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateOrderCommand extends OrderCommand {

    // supply the object responsible for the logic
    final OrderActions orderActions;

    @Override
    public void execute(String orderId, Map<String, Object> updateData) {
        orderActions.updateOrder(orderId, updateData);

        // execute more logic regarding the update of an order
    }

}
