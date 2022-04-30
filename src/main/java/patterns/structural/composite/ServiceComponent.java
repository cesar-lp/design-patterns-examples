package patterns.structural.composite;

import java.math.BigDecimal;

public interface ServiceComponent {
    BigDecimal getPrice();

    String getName();

    void printDescription();
}
