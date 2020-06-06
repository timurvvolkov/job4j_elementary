package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> keyInName = person -> person.getName().contains(key);
        Predicate<Person> keyInSurname = person -> person.getSurname().contains(key);
        Predicate<Person> keyInPhone = person -> person.getPhone().contains(key);
        Predicate<Person> keyInAddress = person -> person.getAddress().contains(key);
        Predicate<Person> combine = keyInName.or(keyInSurname.or(keyInPhone.or(keyInAddress)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
