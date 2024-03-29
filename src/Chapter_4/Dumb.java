package Chapter_4;

/* # 2 # вызов полиморфного метода из конструктора # Dumb.java # Dumber.java */
public class Dumb {
    {
        this.id = 6;
    }

    int id;

    public Dumb() {
        System.out.println("constructor Dumb ");
        id = getId(); // ~ this.getId(); // ~ Dumb.this.getId();
        System.out.println(" id=" + id);
    }

    int getId() { // 1
        System.out.println("getId() of Dumb ");
        return id;
    }
}

class Dumber extends Dumb {
    int id = 9;

    Dumber() {
        System.out.println("constructor Dumber");
        id = this.getId();
        System.out.println(" id=" + id);
    }

    @Override
    int getId() { // 2
        System.out.println("getId() of Dumber");
        return id;
    }
}
