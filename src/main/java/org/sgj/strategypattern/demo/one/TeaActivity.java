package org.sgj.strategypattern.demo.one;

public class TeaActivity {
    private IStrategy strategy;

    public TeaActivity(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void doPromotion(){
        this.strategy.makeTea();
    }
}
