package com.javagda25.comparator.zad1;

import java.util.Comparator;

public class OsobaComparator implements Comparator<Osoba> {
    @Override
    public int compare(Osoba o1, Osoba o2) {
        // (warunek) ? (jeśli_prawda) : (jeśli_fałsz)
//        return o1.getWiek() > o2.getWiek() ? 1 : (o1.getWiek() == o2.getWiek() ? 0 : -1);
        return Integer.compare(o1.getWiek(), o2.getWiek());
    }
}
