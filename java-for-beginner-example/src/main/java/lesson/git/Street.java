package lesson.git;

import object.transport.Repairable;

public class Street implements Repairable {
    private String name;

    public Street(String streetName) {
        this.name = streetName;
    }

    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                '}';
    }

    /** HW 07.05.2020**/



    boolean isNeedRepair = true;

    @Override
    public boolean isNeedToRepair() {
        return isNeedRepair;
    }
    @Override
    public void repair(int cash) {
        System.out.println("No money!");
    }


}