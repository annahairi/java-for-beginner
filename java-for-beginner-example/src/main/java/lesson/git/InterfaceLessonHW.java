package lesson;

import animal.Cat;
import object.MoveObject;
import object.Street;
import object.transport.Boat;
import object.transport.Car;
import object.transport.Plane;
import object.transport.Repairable;


public class InterfaceLessonHW {


    public static void run() {
        car();
        street();
        plane();
        System.out.println("RUUUUUN!!!");
    }

    private static void car() {
        Car car = new Car();
        car.repair(200);
        car.isNeedToRepair();

    }
    private static void street() {
        Street street = new Street("Кирова");
        street.repair(1000000);
        street.isNeedToRepair();
    }

    private static void plane(){
        Plane plane = new Plane();
        plane.repair(1);
        plane.isNeedToRepair();
    }


   /* private static void arrayOfItems()

    {
        int cash = 1000000;
        Repairable[] RepairablesItems = new Repairable[]{new Plane(), new Street("Кирова"), new Car()};
        for (int i = 0; i< RepairablesItems.length; i++) {

        }
    }*/



}
