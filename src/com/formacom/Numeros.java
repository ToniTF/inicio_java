package com.formacom;
import java.util.ArrayList;
import java.util.List;

public class Numeros implements IntNumeros {
    private List<Integer> intergerlist;

    public Numeros(List<Integer> intergerlist) {
        this.intergerlist = intergerlist;
    }

    public Integer min() {
        Integer min = intergerlist.get(0);
        for (Integer numero : intergerlist) {
            if (numero < min) {
                min = numero;
            }
        }
        return min;
    }

    public Integer max() {
        Integer max = intergerlist.get(0);
        for (Integer numero : intergerlist) {
            if (numero > max) {
                max = numero;
            }
        }
        return max;
    }

    public List<Integer> getPares() {
        List<Integer> pares = new ArrayList<>();
        for (Integer numero : intergerlist) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }
        return pares;
    }

    public List<Integer> getImpares() {
        List<Integer> impares = new ArrayList<>();
        for (Integer numero : intergerlist) {
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }
        return impares;
    }

    @Override
    public Integer sum() {
        int sum = 0;
        for (Integer numero : intergerlist) {
            sum += numero;
        }
        return sum;
    }
}
