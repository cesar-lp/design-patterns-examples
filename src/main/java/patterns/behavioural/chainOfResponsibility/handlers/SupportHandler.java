package patterns.behavioural.chainOfResponsibility.handlers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class SupportHandler {

    final SupportHandler successor;

    public void handle(SupportRequest supportRequest) {
        if (successor != null) {
            successor.handle(supportRequest);
        }
    }

    protected abstract boolean canHandleRequest(SupportRequest supportRequest);
}
