package org.sgj.strategypattern.demo.one;

public class DahongpaoStrategy implements IStrategy{
    
    @Override
    public void makeTea() {
        System.out.println("大红袍 需要 使用雨水");
    }
}
