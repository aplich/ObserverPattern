package Observer;

import Observable.Order;

public class MobileApp implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("MobileApp notification - Order number: "+order.getOrderNumber()+" has changed status to "+order.getOrderStatus());
    }

    @Override
    public String toString() {
        return "MobileApp";
    }
}
