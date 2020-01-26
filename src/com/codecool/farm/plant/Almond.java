package com.codecool.farm.plant;

import com.codecool.farm.Planter;

public class Almond extends SpecProductionPlant {
    private static final int FIX_PRODUCTION_PER_MONTH = 50;
    private static final int CHANCE_TO_GROWS_SCHOOM = 8;
    private static final int PRODUCTION_INCREMENT_WITH_SCHROOM = 10;
    private static final int CHANCE_TO_ROT = 13;
    private static final int REDUCTION_IN_PRODUCTION_BY_ROT = 18;

    public Almond() {
        super(FIX_PRODUCTION_PER_MONTH, CHANCE_TO_GROWS_SCHOOM, PRODUCTION_INCREMENT_WITH_SCHROOM, CHANCE_TO_ROT, REDUCTION_IN_PRODUCTION_BY_ROT);
    }

    @Override
    public int produce(Planter planter) {
        int production = super.produce(planter);
        if (production < 40) {
            planter.addPlant(new Almond());
        }
        return production;
    }
}
