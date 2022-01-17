package org.sgj.strategypattern.demo;

import java.util.HashMap;
import java.util.Map;

public class TeaStrategyManager {
    public static final String da_hong_pao = "da_hong_pao";
    public static final String tie_guan_yin = "tie_guan_yin";
    public static final String mao_jian = "mao_jian";
    public static final String DEFAULT = "mao_jian";
    private static Map<String, IStrategy> teaStrategies = new HashMap<>();
    static {
        teaStrategies.put(da_hong_pao,new DahongpaoStrategy());
        teaStrategies.put(tie_guan_yin,new TieguanyinStrategy());
        teaStrategies.put(mao_jian,new MaojianStrategy());
    }
    public static IStrategy get(String key)
    {
        if (!teaStrategies.containsKey(key)) {
            return teaStrategies.get(DEFAULT);
        }
        return teaStrategies.get(key);
    }
}
