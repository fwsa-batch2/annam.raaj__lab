package com.JavaBasics;

import java.util.ArrayList;
import java.util.Locale;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> InternationalTrips= new ArrayList<>();
        InternationalTrips.add("France");
        InternationalTrips.add("Dubai");
        InternationalTrips.add("New York");
        System.out.println("International Trips list : "+InternationalTrips);

        ArrayList<String> RegionalTrips= new ArrayList<>();
        RegionalTrips.add("Agra");
        RegionalTrips.add("Delhi");
        RegionalTrips.add("Varanasi");
        System.out.println("Regional Trips list : "+RegionalTrips);

        InternationalTrips.addAll(RegionalTrips);
        ArrayList AllTrips= (ArrayList) InternationalTrips.clone();
        System.out.println("All Trips :" +AllTrips);

        InternationalTrips.removeIf(n -> (n.charAt(0)=='D'));
        System.out.println("All Trips after removing  :" + InternationalTrips);

        InternationalTrips.forEach(n-> System.out.println("Int_Trips before lower case: "+n));
        InternationalTrips.replaceAll(e -> e.toLowerCase());
        InternationalTrips.forEach(n-> System.out.println("Int_Trips before lower case: "+ n));

        InternationalTrips.forEach(n-> System.out.println("Int_Trips before lower case: " +n));
        InternationalTrips.replaceAll(a -> a.toUpperCase());
        InternationalTrips.forEach(n-> System.out.println("Int_Trips before lower case: " + n));

    }
}
