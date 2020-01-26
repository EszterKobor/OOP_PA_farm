package com.codecool.farm;

import com.codecool.farm.plant.Plant;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Farm implements Planter {
    private Set<Plant> plants = new CopyOnWriteArraySet<>();
    private int totalFoodProduction;

    @Override
    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void growPlants() {
        Iterator iterator = plants.iterator();
        while (iterator.hasNext()) {
            Plant plant = (Plant) iterator.next();
            int production = plant.produce(this);
            totalFoodProduction += production;
            System.out.println(plants);
        }
    }

    public int getTotalFoodProduction() {
        return totalFoodProduction;
    }
}
