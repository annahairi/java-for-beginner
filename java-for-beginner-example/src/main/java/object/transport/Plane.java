package object.transport;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import object.MoveObject;

import java.sql.SQLOutput;

public class Plane implements EngineVehicle, SaleObject, MoveObject, Repairable
{
    private boolean isEnableLeftPlaneEngine = false;
    private boolean isEnableRightPlaneEngine = false;

    private int price = 100000000;
    private int workHours = 0;

    private int distance = 0;

    public Plane()
    {

    }

    public Plane(int maxCountPeople)
    {

    }

    @Override
    public void start()
    {
        isEnableLeftPlaneEngine = true;
        isEnableRightPlaneEngine = true;
        workHours = workHours +2;
    }

    @Override
    public void stop()
    {
        isEnableLeftPlaneEngine = true;
        isEnableRightPlaneEngine = true;
    }

    @Override
    public void setSpeed()
    {

    }

    @Override
    public boolean isOn()
    {

//        if (isEnableRightPlaneEngine == true && isEnableLeftPlaneEngine)
//        {
//            return true;
//        }
//        else {
//            return false;
//        }
        return isEnableLeftPlaneEngine && isEnableRightPlaneEngine;
    }

    @Override
    public int getCurrentPrice()
    {
        return price - workHours*100;
    }

    @Override
    public void move(int newDistance)
    {
        distance = distance + newDistance;
    }

    @Override
    public int getDistance()
    {
        return distance;
    }

    /** HW 07.05.2020**/

    boolean isNeedRepair = true;

    int costOfRepair=500;

    @Override

    public boolean isNeedToRepair() {
        return isNeedRepair;
    }

    @Override
    public void repair(int cash) {
        if (cash > costOfRepair){
            isNeedRepair = false;
            System.out.println("plane fixed");
        }else {
            costOfRepair = costOfRepair - cash;
            System.out.println("Not enough money, add " + costOfRepair + " coins");
        }
    }
}
