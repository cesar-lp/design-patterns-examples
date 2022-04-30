package patterns.structural.composite;

import lombok.val;

import java.math.BigDecimal;
import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        val serviceSubscriptions = new ArrayList<ServiceComponent>();
        serviceSubscriptions.add(new ServiceSubscription("AWS", BigDecimal.valueOf(15.00)));

        val netflix = new ServiceSubscription("Netflix", BigDecimal.valueOf(10.00));
        val hbo = new ServiceSubscription("HBO", BigDecimal.valueOf(12.00));
        val compoundService = new CompoundService("TV", asList(netflix, hbo));
        serviceSubscriptions.add(compoundService);

        serviceSubscriptions.forEach(ServiceComponent::printDescription);
    }
}
