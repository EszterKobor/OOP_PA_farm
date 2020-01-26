package com.codecool.farm.plant;

import com.codecool.farm.Planter;

import static com.codecool.farm.MyUtil.eventWithChance;

public abstract class SpecProductionPlant extends Plant {
    protected final int chanceToGrowsSchrooms;
    protected final int productionIncrementWithSchroom;
    protected final int chanceToRot;
    protected final int reductionInProductionByRot;

    public SpecProductionPlant(int PRODUCTION_PER_MONTH, int ChanceToGrowsSchrooms, int ProductionIncrementWithSchroom, int chanceToRot, int reductionInProductionByRot) {
        this.fix_production_per_month = PRODUCTION_PER_MONTH;
        this.chanceToGrowsSchrooms = ChanceToGrowsSchrooms;
        this.productionIncrementWithSchroom = ProductionIncrementWithSchroom;
        this.chanceToRot = chanceToRot;
        this.reductionInProductionByRot = reductionInProductionByRot;
    }

    @Override
    public int produce(Planter planter) {
        int production =super.produce(planter);
        if (eventWithChance(chanceToGrowsSchrooms)) {
            production += productionIncrementWithSchroom;
        }
        if (eventWithChance(chanceToRot)) {
            production = 0;
            fix_production_per_month = Math.max(fix_production_per_month - reductionInProductionByRot, 0);
        }
        return production;
    }



}
