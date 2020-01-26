package com.codecool.farm.plant;

import com.codecool.farm.Planter;

public abstract class Plant {
    protected int fix_production_per_month;
    protected int FIX_PRODUCTION_INCREMENT_IN_EVERY_MONTH = 4;
    protected int actualMonthNumber = 0;

    public int produce(Planter planter) {
        actualMonthNumber++;
        if (actualMonthNumber > 1) {
            fix_production_per_month += FIX_PRODUCTION_INCREMENT_IN_EVERY_MONTH;
        }
        return fix_production_per_month;
    }

}
