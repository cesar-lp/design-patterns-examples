package patterns.structural.composite;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompoundService implements ServiceComponent {

    String name;
    List<ServiceSubscription> servicesSubscriptions;

    public BigDecimal getPrice() {
        return servicesSubscriptions
                .stream()
                .map(ServiceSubscription::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public void printDescription() {
        System.out.println(name + " - total $" + getPrice());
    }
}
