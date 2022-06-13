import interfaces.Service;

import java.util.ArrayList;

public class Bar implements Service {
    ArrayList<String> menu = new ArrayList<String>();

    public Bar() {
        menu.add("Cofe");
        menu.add("Cake");
        menu.add("Tea");
        menu.add("Sugar");
        menu.add("IceCream");

    }

    public String cook(String name) {
        if (menu.contains(name)) {
            return name;
        } else {
            return ("Блюдо не найдено");
        }
    }

    public void sale(Float cost) {

    }
}
