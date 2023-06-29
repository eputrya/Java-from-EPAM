package Chapter_3;

/* # 9 # метод, который возвращает объект в оболочке */

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class findById {
    public Optional<Order> findById(List<Order> orders, long id) {
        List<Order> result = orders.stream()
//               .filter(o -> id == o.getOrderId())
                .collect(Collectors.toList());
        Optional<Order> optionalOrder = result.size() != 0 ? Optional.of(result.get(0)) : Optional.empty();
        return optionalOrder;
    }
}
