package com.javagda25.comparator.zad1;

import java.util.*;

public class MainNajszybszy {
    public static void main(String[] args) {
        List<Osoba> osobas = new ArrayList<>(Arrays.asList(
                new Osoba("a", "b", 3),
                new Osoba("aa", "b", 23),
                new Osoba("aawd", "b", 56),
                new Osoba("aerg", "b", 35),
                new Osoba("adrth", "b", 11),
                new Osoba("atyj", "b", 23),
                new Osoba("asdg", "b", 37),
                new Osoba("adfh", "b", 7),
                new Osoba("adfnt", "b", 18),
                new Osoba("asdgr", "b", 15),
                new Osoba("adth", "b", 65),
                new Osoba("aftjftj", "b", 21)
        ));

        // klasa anonimowa
        Collections.sort(osobas, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba o1, Osoba o2) {
                return Integer.compare(o1.getWiek(), o2.getWiek());
            }
        });
        System.out.println(osobas);
    }
}
