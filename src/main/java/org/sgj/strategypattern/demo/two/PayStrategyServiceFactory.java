package org.sgj.strategypattern.demo.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class PayStrategyServiceFactory {

    @Resource
    private List<IPayStrategyService> payStrategyServices;

    @Bean("payServicesMap")
    public Map<PayEnum, IPayStrategyService> payStrategyServicesMap(){

        Map<PayEnum, IPayStrategyService> map = new HashMap<>();
        payStrategyServices.stream().forEach(p -> {
            map.put(p.getPayType(), p);
        });
        return map;
    }
}
