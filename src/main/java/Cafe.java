import interfaces.Service;

public class Cafe implements Service {

    public void cook(String name) {

    }

    public String sell(float cash, String dishName) {
        if (cash - 4.75 < 1) throw new DishNotFoundException();

    }


}
