package lesson;

import java.util.HashSet;

public class HashSetHomeWork {

public static void hashSetMethod() {
    HashSet<Street> hashSet = new HashSet<Street>();


    hashSet.add(new Street("Ломоносова", "Центральный",1000));
    hashSet.add(new Street("Лизюкова", "Северный",2000));
    hashSet.add(new Street("Лизюкова", "Северный", 2000));
    System.out.println(hashSet);
    System.out.println(hashSet.size());
    }

}
