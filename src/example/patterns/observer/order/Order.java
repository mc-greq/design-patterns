package example.patterns.observer.order;

import example.patterns.observer.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable{

    private Set<Observer> registeredObservers = new HashSet<>();
    private Long orderNr;
    private OrderStatus orderStatus;

    public Order(Long orderNr, OrderStatus orderStatus) {
        this.orderNr = orderNr;
        this.orderStatus = orderStatus;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        registeredObservers.forEach(observer -> observer.updateOrderStatus(this));
    }

    public void changeOrderStatus(OrderStatus status){
        this.orderStatus = status;
        notifyObservers();
    }

    public Long getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(Long orderNr) {
        this.orderNr = orderNr;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
