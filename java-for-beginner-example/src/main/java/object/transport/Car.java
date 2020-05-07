package object.transport;

public class Car implements EngineVehicle, SaleObject, Repairable {
    private boolean isCarEngineEnable = false;


    @Override
    public void start() {
        isCarEngineEnable = true;
    }

    @Override
    public void stop() {
        isCarEngineEnable = false;
    }

    @Override
    public void setSpeed() {

    }

    @Override
    public boolean isOn() {
        return isCarEngineEnable;
    }

    @Override
    public int getCurrentPrice() {
        return 100;
    }


    /** HW 07.05.2020**/

    @Override
    public boolean isNeedToRepair() {
        return isNeedRepair;
    }

    boolean isNeedRepair = true;

    @Override

    public void repair(int cash) {

        if (cash > 10) {
            isNeedRepair = false;
            System.out.println("Fixed");
        } else {
            isNeedRepair = true;
            System.out.println("No cash - no fixes!");
        }
    }

}

