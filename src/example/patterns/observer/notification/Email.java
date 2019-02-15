package example.patterns.observer.notification;

import example.patterns.observer.order.Order;

public class Email implements Observer{

    @Override
    public void updateOrderStatus(Order order){
        System.out.println("EMAIL - Order nr: " + order.getOrderNr() + " changed status: " + order.getOrderStatus());
    }
}