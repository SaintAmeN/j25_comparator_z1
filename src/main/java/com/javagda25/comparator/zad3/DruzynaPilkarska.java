package com.javagda25.comparator.zad3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DruzynaPilkarska {
    private String nazwa;
    private int bramkiStracone, bramkiTrafione,
            meczeWygrane, meczePrzegrane,
            meczeZremisowane, liczbapunktow;

}
