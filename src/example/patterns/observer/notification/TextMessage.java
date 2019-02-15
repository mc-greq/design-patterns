package example.patterns.observer.notification;

import example.patterns.observer.order.Order;

public class TextMessage implements Observer{

    @Override
    public void updateOrderStatus(Order order){
        System.out.println("SMS - Order nr: " + order.getOrderNr() + " changed status: " + order.getOrderStatus());
    }
}
