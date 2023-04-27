package org.sgj.strategypattern.demo.one;

public class MaojianStrategy implements IStrategy{

    @Override
    public void makeTea() {
        System.out.println("毛尖 需要 使用井水");
    }
}
