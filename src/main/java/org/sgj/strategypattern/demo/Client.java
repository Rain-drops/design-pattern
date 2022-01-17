package org.sgj.strategypattern.demo;

public class Client {
    public static void main(String[] args) {
        new TeaActivity(new DahongpaoStrategy()).doPromotion();

        TeaStrategyManager.get("mao_jian").makeTea();

        new TeaActivity(TeaStrategyManager.get("tie_guan_yin")).doPromotion();
    }
}
