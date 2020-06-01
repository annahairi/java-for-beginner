package object;

import lesson.Street;

import java.util.Objects;

public class House {

    Street street1 = new Street("Ломоносова", "Центральный",1000);
    Street street2 = new Street("Лизюкова", "Северный",2000);
    Street street3 = new Street("Лизюкова", "Северный", 2000);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(street1, house.street1) &&
                Objects.equals(street2, house.street2) &&
                Objects.equals(street3, house.street3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street1, street2, street3);
    }
}