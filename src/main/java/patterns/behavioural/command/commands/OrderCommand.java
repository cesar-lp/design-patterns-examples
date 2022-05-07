package patterns.behavioural.command.commands;

import java.util.Map;

public abstract class OrderCommand {
    public abstract void execute(String orderId, Map<String, Object> orderData);
}
