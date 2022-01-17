package org.sgj.strategypattern.demo;

public class MaojianStrategy implements IStrategy{

    @Override
    public void makeTea() {
        System.out.println("毛尖 需要 使用井水");
    }
}
