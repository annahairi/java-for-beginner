package lesson;

import object.transport.Repairable;

import java.util.Objects;

public class Street {
    private final String name;
    public String description;
    public int apartmentsAmount;

    public Street(String name, String description, int apartmentsAmount) {
        this.name = name;
        this.description = description;
        this.apartmentsAmount = apartmentsAmount;
    }


    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", apartmentsAmount=" + apartmentsAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return apartmentsAmount == street.apartmentsAmount &&
                Objects.equals(name, street.name) &&
                Objects.equals(description, street.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, apartmentsAmount);
    }
}

    //   public Street(String streetName) {
  //      this.name = streetName;
//    }


    /** HW 07.05.2020**/
// public int size;
 /*   boolean isNeedRepair = true;

    @Override
    public boolean isNeedToRepair() {
        return isNeedRepair;
    }
    @Override
    public void repair(int cash) {
        System.out.println("No money!");
    }*/
