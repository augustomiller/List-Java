package com.github.maicmiller;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> listCars = new ArrayList<>();

        listCars.add(new Car("Ford"));
        listCars.add(new Car("Chevrolet"));
        listCars.add(new Car("Fiat"));
        listCars.add(new Car("Peugeot"));

        System.out.println(listCars.contains(new Car("Ford")));

        /*
        * Pega o carro que está na posição índice 2...
        * */
        System.out.println(listCars.get(2));

        /*
        * Descobrir em qual índice está o carro Fiat...
        * */
        System.out.println(listCars.indexOf(new Car("Fiat")));

        /*
        * Removendo
        * */
        System.out.println(listCars.remove(2));
        System.out.println(listCars);
    }
}
