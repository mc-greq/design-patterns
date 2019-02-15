package example.patterns.observer;

import example.patterns.observer.notification.Email;
import example.patterns.observer.notification.MobileApp;
import example.patterns.observer.notification.TextMessage;
import example.patterns.observer.order.Order;
import example.patterns.observer.order.OrderStatus;

public class ObserverRun {

    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.RECEIVED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println();
        order.changeOrderStatus(OrderStatus.SENT);

        order.unregisterObserver(textMessage);

        System.out.println();
        order.changeOrderStatus(OrderStatus.REGISTERED);
    }
}
