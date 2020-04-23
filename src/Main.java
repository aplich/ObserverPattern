import Observable.Order;
import Observable.OrderStatus;
import Observer.Email;
import Observer.MobileApp;
import Observer.SMS;

public class Main {
    public static void main(String[] args) {
        SMS sms = new SMS();
        Email email = new Email();
        MobileApp mobileApp = new MobileApp();

        Order order = new Order(250L, OrderStatus.REGISTERED);

        order.registerObserver(sms);
        order.registerObserver(email);
        order.registerObserver(mobileApp);
        System.out.println();

        order.changeOrderStatus(OrderStatus.REGISTERED);
        System.out.println();

        order.unregisterObserver(email);
        order.changeOrderStatus(OrderStatus.SENT);
        System.out.println();

        order.unregisterObserver(sms);
        System.out.println();

        order.changeOrderStatus(OrderStatus.RECEIVED);

    }
}
