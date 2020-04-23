package Observer;

import Observable.Order;

public class Email implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("Email notification - Order number: "+order.getOrderNumber()+" has changed status to "+order.getOrderStatus());
    }

    @Override
    public String toString() {
        return "Email";
    }
}
