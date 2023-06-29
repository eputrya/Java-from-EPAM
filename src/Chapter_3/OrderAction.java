package Chapter_3;

/* # 8 # метод, который может возвратить null # OrderAction.java */

import java.util.List;
import java.util.stream.Collectors;

public class OrderAction {
    public Order findById(List<Order> orders, long id) {
        Order order = null;
        List<Order> result = orders.stream()
//                .filter(o -> id == o.getOrderId())
                .collect(Collectors.toList());
        if (result.size() != 0) {
            order = result.get(0);
        }
        return order;
    }
}
