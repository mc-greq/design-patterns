package example.patterns.observer.notification;

import example.patterns.observer.order.Order;

public interface Observer {

    void updateOrderStatus(Order order);
}
