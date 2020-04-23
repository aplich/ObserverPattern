package Observer;

import Observable.Order;

public class SMS implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("SMS notification - Order number: "+order.getOrderNumber()+" has changed status to "+order.getOrderStatus());
    }

    @Override
    public String toString() {
        return "SMS";
    }
}
