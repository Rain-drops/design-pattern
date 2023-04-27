package org.sgj.strategypattern.demo.one;

public class TieguanyinStrategy implements IStrategy{
    
    @Override
    public void makeTea() {
        System.out.println("铁观音 需要 使用山泉水");
    }
}
