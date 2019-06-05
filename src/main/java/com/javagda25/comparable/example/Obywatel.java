package com.javagda25.comparable.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Obywatel implements Comparable<Obywatel> {
    private int wiek;
    private String imie;

    @Override
    public int compareTo(Obywatel o) {
        if (this.wiek > o.wiek) {
            return 1;
        } else if (this.wiek < o.wiek) {
            return -1;
        }
        return 0;
    }
}
