package org.sgj.strategypattern.demo.two;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class PayStrategyController {

    @Resource
    private Map<PayEnum, IPayStrategyService> payStrategyServicesMap;

    @PostMapping("/dopay")
    public String doPay(){
        payStrategyServicesMap.get(PayEnum.ALIPAY).pay(new Object());
        return null;
    }
}
