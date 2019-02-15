package example.patterns.observer.notification;

import example.patterns.observer.order.Order;

public class MobileApp implements Observer{

    @Override
    public void updateOrderStatus(Order order){
        System.out.println("MOBILE - Order nr: " + order.getOrderNr() + " changed status: " + order.getOrderStatus());
    }
}
