package com.codecool.farm.plant;

import com.codecool.farm.Planter;

public class Juniper extends Plant implements Evergreen {
    private static final int FIX_PRODUCTION_PER_MONTH = 14;

    public Juniper() {
        fix_production_per_month = FIX_PRODUCTION_PER_MONTH;
    }

    @Override
    public int produce(Planter planter) {
        int production = super.produce(planter);
        if (actualMonthNumber % LEAVES_GROWING_IN_EVERY_THIS_MONTH == 0) {
            production += PRODUCTION_INCREMENT_WITH_LEAVES;
        }
        if (production > MAX_PRODUCTION) {
            production = MAX_PRODUCTION;
            System.out.println( "Juniter at full production!");
        }
        return production;
    }

}
