package com.javagda25.comparator.zad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DruzynaPilkarska> druzynaPilkarskas = new ArrayList<>();
        druzynaPilkarskas.add(new DruzynaPilkarska("abcde", 1, 5, 5, 5, 5, 5));
        druzynaPilkarskas.add(new DruzynaPilkarska("abcde", 1, 4, 5, 5, 5, 5));
        druzynaPilkarskas.add(new DruzynaPilkarska("abcde", 2, 4, 5, 5, 5, 5));
        druzynaPilkarskas.add(new DruzynaPilkarska("abcde", 2, 4, 5, 5, 5, 5));
        druzynaPilkarskas.add(new DruzynaPilkarska("aa", 2, 4, 5, 5, 5, 5));

        Collections.sort(druzynaPilkarskas, new Comparator<DruzynaPilkarska>() {
            @Override
            public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {
                if (o1.getLiczbapunktow() > o2.getLiczbapunktow()) {
                    return -1;
                } else if (o1.getLiczbapunktow() < o2.getLiczbapunktow()) {
                    return 1;
                }

                // nie udalo mi się wyłonić zwycięzcy, więc sprawdzam drugie kryterium
                if (o1.getBramkiTrafione() > o2.getBramkiTrafione()) {
                    return -1;
                } else if (o1.getBramkiTrafione() < o2.getBramkiTrafione()) {
                    return 1;
                }

                // nie udalo mi się wyłonić zwycięzcy, więc sprawdzam trzecie kryterium
                if (o1.getBramkiStracone() > o2.getBramkiStracone()) {
                    return 1;
                } else if (o1.getBramkiStracone() < o2.getBramkiStracone()) {
                    return -1;
                }

                // nie udalo mi się wyłonić zwycięzcy, więc sprawdzam czwarte kryterium
                return o1.getNazwa().compareTo(o2.getNazwa()); // równe == 0
            }
        });

        druzynaPilkarskas.forEach(System.out::println);
    }
}
