package com.javagda25.comparator.zad1;

import java.util.*;

public class MainNajszybszyNajkrotszy {
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
        Collections.sort(osobas, (o1, o2) -> Integer.compare(o1.getWiek(), o2.getWiek()));
        System.out.println(osobas);
    }

    public static int metodaPorownojaca(int opcja_a, int opcja_b) {
        // jeśli opcja_a > opcja_b = zwróć opcja_a;
        // w przeciwnym razie zwróć opcja_b
//        return (opcja_a > opcja_b) ? opcja_a : opcja_b;

        // jeśli opcja_a > opcja_b = zwróć opcja_a;
        // w przeciwnym razie porównaj czy są sobie równe
        return (opcja_a > opcja_b) ? opcja_a : (opcja_a == opcja_b ? 0 : opcja_b);
    }
}
