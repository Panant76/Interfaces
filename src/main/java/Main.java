import interfaces.Service;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Service cafe = new Cafe();
        Service bar = new Bar();
        Service culinaria = new Culinaria();
        Service foodtrack = new FoodTrack();

        ArrayList<Service> services = new ArrayList<Service>();
        services.add(cafe);
        services.add(bar);
        services.add(culinaria);
        services.add(foodtrack);


    }
}
