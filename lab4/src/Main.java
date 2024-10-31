import people.*;
import vehicles.*;

public class Main {
    public static void main(String[] args) {
        RegularPerson regular1 = new RegularPerson("Антон");
        RegularPerson regular2 = new RegularPerson("Марія");
        RegularPerson regular3 = new RegularPerson("Олег");
        RegularPerson regular4 = new RegularPerson("Світлана");
        RegularPerson regular5 = new RegularPerson("Іван");
        RegularPerson regular6 = new RegularPerson("Оксана");
        RegularPerson regular7 = new RegularPerson("Дмитро");

        Policeman policeman1 = new Policeman("Олександр");
        Policeman policeman2 = new Policeman("Сергій");
        Policeman policeman3 = new Policeman("Віталій");
        Policeman policeman4 = new Policeman("Андрій");

        Firefighter firefighter1 = new Firefighter("Ігор");
        Firefighter firefighter2 = new Firefighter("Роман");
        Firefighter firefighter3 = new Firefighter("Петро");
        Firefighter firefighter4 = new Firefighter("Михайло");

        Taxi taxi = new Taxi(4);
        Bus bus = new Bus(6);
        PoliceCar policeCar = new PoliceCar(4);
        FireTruck fireTruck = new FireTruck(4);

        taxi.addPassenger(regular1, regular2, firefighter1, policeman1);
        bus.addPassenger(regular3, regular4, regular5, regular6, policeman2, regular7);
        fireTruck.addPassenger(firefighter1, firefighter2, firefighter3, firefighter4);
        policeCar.addPassenger(policeman1, policeman2, policeman3, policeman4);

        Road road = new Road();
        road.addVehicle(taxi, bus, fireTruck, policeCar);

        System.out.println(road.countPeopleOnTheRoad());
    }
}