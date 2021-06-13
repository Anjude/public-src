package com.company.collection;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Anjude
 * @date 2021/5/21 23:13
 */
public class PersonTreeMap {
    private Integer age;

    public PersonTreeMap(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }


    public static void main(String[] args) {
        TreeMap<PersonTreeMap, String> treeMap = new TreeMap<>(new Comparator<PersonTreeMap>() {
            @Override
            public int compare(PersonTreeMap personTreeMap1, PersonTreeMap personTreeMap2) {
                int num = personTreeMap1.getAge() - personTreeMap2.getAge();
                return Integer.compare(num, 0);
            }
        });
        treeMap.put(new PersonTreeMap(3), "PersonTreeMap1");
        treeMap.put(new PersonTreeMap(18), "PersonTreeMap2");
        treeMap.put(new PersonTreeMap(35), "PersonTreeMap3");
        treeMap.put(new PersonTreeMap(16), "PersonTreeMap4");
        treeMap.entrySet().stream().forEach(personTreeMapStringEntry -> {
            System.out.println(personTreeMapStringEntry.getValue());
        });
        TreeMap<PersonTreeMap, String> treeMapSec = new TreeMap<>((person1, person2) -> {
            int num = person1.getAge() - person2.getAge();
            return Integer.compare(num, 0);
        });
        treeMapSec.entrySet().stream().forEach(personTreeMapStringEntry -> {
            System.out.println(personTreeMapStringEntry.getValue());
        });

    }
}
