package com.codecool.farm.plant;

import com.codecool.farm.Planter;

public class Spruce extends SpecProductionPlant implements Evergreen {
    private static final int FIX_PRODUCTION_PER_MONTH = 26;
    private static final int CHANCE_TO_GROWS_SCHOOM = 5;
    private static final int PRODUCTION_INCREMENT_WITH_SCHROOM = 15;
    private static final int CHANCE_TO_ROT = 4;
    private static final int REDUCTION_IN_PRODUCTION_BY_ROT = 20;

    public Spruce() {
        super(FIX_PRODUCTION_PER_MONTH, CHANCE_TO_GROWS_SCHOOM, PRODUCTION_INCREMENT_WITH_SCHROOM, CHANCE_TO_ROT, REDUCTION_IN_PRODUCTION_BY_ROT);
    }

    @Override
    public int produce(Planter planter) {
        int production = super.produce(planter);
        if (actualMonthNumber % LEAVES_GROWING_IN_EVERY_THIS_MONTH == 0) {
            production += PRODUCTION_INCREMENT_WITH_LEAVES;
        }
        if (production > MAX_PRODUCTION) {
            production = MAX_PRODUCTION;
            System.out.println( "Spruce at full production!");
        }
        return production;
    }
}
