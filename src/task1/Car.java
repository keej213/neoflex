package task1;


public class Car {
    long mileage;
    String mark;
    Engine engine;
    Wheel[] wheels;

    public void printMileage() {
        System.out.println("Car.mileage = " + mileage);
    }
    public long getMileage()
    {
        return mileage;
    }
    public void summerySeason(Wheel wheel, enumSeason season) {
        if (season == enumSeason.SUMMER) {
            wheel.season= enumSeason.SUMMER;
        } else {
            wheel.season = enumSeason.WINTER;
        }
    }
    public void infoFuel(){
           System.out.println(mileage*engine.consuption);
    }


    public void infoCar(){
        System.out.println("Car.mileage = " + mileage);
        System.out.println("Car.mark = " + mark);
        System.out.println("Car.engine.power = " + engine.power);
        System.out.println("Car.engine.consuption = " + engine.consuption);
        System.out.println("Car.wheels[0].diametr = " + wheels[0].diametr);
        System.out.println("Car.wheels[0].season = " + wheels[0].season);
        System.out.println("Car.wheels[1].diametr = " + wheels[1].diametr);
        System.out.println("Car.wheels[1].season = " + wheels[1].season);
        System.out.println("Car.wheels[2].diametr = " + wheels[2].diametr);
        System.out.println("Car.wheels[2].season = " + wheels[2].season);
        System.out.println("Car.wheels[3].diametr = " + wheels[3].diametr);
        System.out.println("Car.wheels[3].season = " + wheels[3].season);




        }
}
