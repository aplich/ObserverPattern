package Observer;

import Observable.Order;

public interface Observer {
    void update(Order order);
}
