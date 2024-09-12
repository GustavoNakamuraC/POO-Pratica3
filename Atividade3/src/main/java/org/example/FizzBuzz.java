package org.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    int numMax;
    List<String> fbList = new ArrayList<>();

    public FizzBuzz(int numMax) {
        this.numMax = numMax;
    }

    private String getFizzBuzz() {
        return "FizzBuzz";
    }

    private String getBuzz() {
        return "Buzz";
    }

    private String getFizz() {
        return "Fizz";
    }

    public void criarListaFizzBuzz() {
        for (int i = 1; i <= this.numMax; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fbList.add(getFizzBuzz());
            }else if (i % 3 == 0) {
                fbList.add(getFizz());
            }else if (i % 5 == 0) {
                fbList.add(getBuzz());
            }else {
                fbList.add(String.valueOf(i));
            }
        }
    }

    public void apresentarListaFizzBuzz() {
        for (int i = 0; i < this.numMax; i++) {
            System.out.println(fbList.get(i));
        }
    }
}
