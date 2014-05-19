package task1;
public class Main {


    public static void main(String[] args) {

        Car car = new Car();
        car.mileage = 12l;
        car.mark = "volvo";


        Engine engine = new Engine();
        engine.consuption = 10.3;
        engine.power = 300.4f;

        car.engine = engine;

        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();

        car.wheels[0] = wheel1;
        car.wheels[1] = wheel2;
        car.wheels[2] = wheel3;
        car.wheels[3] = wheel4;


        car.wheels[0].diametr = 15;
        car.wheels[0].season = enumSeason.SUMMER;
        car.wheels[1].diametr = 15;
        car.wheels[1].season = enumSeason.SUMMER;
        car.wheels[2].diametr = 15;
        car.wheels[2].season = enumSeason.SUMMER;
        car.wheels[3].diametr = 15;
        car.wheels[3].season = enumSeason.SUMMER;

        car.printMileage();
        engine.printConsuption();
        engine.printPower();
        car.wheels[0].printDiametr();
        car.wheels[0].printSummery();
        car.wheels[1].printDiametr();
        car.wheels[1].printSummery();
        car.wheels[2].printDiametr();
        car.wheels[2].printSummery();
        car.wheels[3].printDiametr();
        car.wheels[3].printSummery();

        System.out.println(car.getMileage());

        car.summerySeason(car.wheels[0], enumSeason.WINTER);
        car.summerySeason(car.wheels[1], enumSeason.WINTER);
        car.summerySeason(car.wheels[2], enumSeason.WINTER);
        car.summerySeason(car.wheels[3], enumSeason.WINTER);

        System.out.println(car.wheels[0].season);
        System.out.println(car.wheels[0].diametr);
        System.out.println(car.wheels[1].season);
        System.out.println(car.wheels[1].diametr);
        System.out.println(car.wheels[2].season);
        System.out.println(car.wheels[2].diametr);
        System.out.println(car.wheels[3].season);
        System.out.println(car.wheels[3].diametr);

    }

}