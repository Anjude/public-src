package com.company.advancebase;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Anjude
 * @Date 2021/5/14 21:33
 */
public class Pizza {

    private static EnumSet<PizzaStatus> undeliveredPizzaStatuses =
            EnumSet.of(PizzaStatus.ORDERED, PizzaStatus.READY);

    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    private PizzaStatus status;

    public enum PizzaStatus {
        ORDERED, READY,DELIVERED;

        public boolean isReady() {
            return true;
        }

        public String getTimeToDelivery() {
            return "xxx";
        }
    }

    public boolean isDeliverable() {
        return this.status.isReady();
    }

    public void printTimeToDeliver() {
        System.out.println("Time to delivery is " +
                this.getStatus().getTimeToDelivery() + " days");
    }

    public static List<Pizza> getAllUndeliveredPizzas(List<Pizza> input) {
        return input.stream().filter(
                (s) -> undeliveredPizzaStatuses.contains(s.getStatus()))
                .collect(Collectors.toList());
    }

    public void deliver() {
        if (isDeliverable()) {
//            PizzaDeliverySystemConfiguration.getInstance().getDeliveryStrategy().deliver(this);
            this.setStatus(PizzaStatus.DELIVERED);
        }
    }

    // Methods that set and get the status variable.
}

