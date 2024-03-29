package com.javagda25.comparator.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
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

        // instancja anonimowa
        Collections.sort(osobas, new OsobaComparator());
        System.out.println(osobas);
    }
}
