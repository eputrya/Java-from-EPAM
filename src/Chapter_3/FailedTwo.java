package Chapter_3;

/* # 20 # неправильное объявление и использование полей параметризованного
класса # FailedTwo.java */


public class FailedTwo<T> {
    //  static T t;   cannot be referenced from a static context
}

class FailedThree<K> {
    K k;

   /* static void takeKey(K k) { cannot be referenced from a static context
        // ,,,,
    } */
}


