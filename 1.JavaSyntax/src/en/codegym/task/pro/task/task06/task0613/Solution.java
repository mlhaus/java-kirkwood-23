package en.codegym.task.pro.task.task06.task0613;

/*
Giant cities
*/

import en.codegym.task.pro.task06.task0610.Person;

public class Solution {
    public static String city = "Tokyo";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seoul", 25.2);
        printCityPopulation("Delhi", 23.1);
        printCityPopulation("New York City", 21.6);
        Person person = new Person("Marc", "Hauschildt");
        person.getFirstName();
    }

    public static void printCityPopulation(String otherCity, double otherPopulation) {
        System.out.println("The population of " + otherCity + " is " + otherPopulation + " million.");
        System.out.println("But in the most populous city, " + city + ", the population is " + population + " million.");
    }
}
