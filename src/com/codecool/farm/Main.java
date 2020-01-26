package com.codecool.farm;

import com.codecool.farm.plant.Almond;
import com.codecool.farm.plant.Juniper;
import com.codecool.farm.plant.Spruce;

public class Main {

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addPlant(new Almond());
        farm.addPlant(new Almond());
        farm.addPlant(new Spruce());
        farm.addPlant(new Spruce());
        farm.addPlant(new Juniper());
        farm.addPlant(new Juniper());

        for (int i=0; i < 13; i++) {
            farm.growPlants();
        }

        System.out.println(farm.getTotalFoodProduction());
    }

}
