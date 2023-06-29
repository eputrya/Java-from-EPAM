package Chapter_3;

/* # 10 # обработка Optional # OptionalMain.java*/

import java.util.*;

public class OptionalMain {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        list.add(new Order(71L, 100D));
        list.add(new Order(18L, 132D));
        list.add(new Order(24L, 210D));
        list.add(new Order(35L, 693D));
        OrderAction action = new OrderAction();
        Optional<Order> optionalOrder = Optional.ofNullable(action.findById(list, 24)); // replaced by 23
        if (optionalOrder.isPresent()) {
            System.out.println(optionalOrder.get());
        }
        Set<Order> set = new HashSet<>();
        optionalOrder.ifPresent(set::add); // or o->set.add(o)
        System.out.println(set);
    }
}
