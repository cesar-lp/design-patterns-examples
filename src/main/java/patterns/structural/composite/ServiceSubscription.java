package patterns.structural.composite;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ServiceSubscription implements ServiceComponent {

    String name;

    BigDecimal price;

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void printDescription() {
        System.out.println(name + " - price: $" + price);
    }
}
