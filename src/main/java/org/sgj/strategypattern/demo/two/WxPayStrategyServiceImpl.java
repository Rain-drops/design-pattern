package org.sgj.strategypattern.demo.two;

import org.springframework.stereotype.Service;

@Service
public class WxPayStrategyServiceImpl implements IPayStrategyService {

    @Override
    public PayEnum getPayType() {
        return PayEnum.WECHATPAY;
    }

    @Override
    public void pay(Object obj) {
        // 1.签名，各个支付商签名方式可能不一样，所以交由各个子类实现

        // 2.创建订单，创建订单的逻辑大致一致，可以在抽象类中实现，如有不一致的可再子类中重写

        // 3.支付的逻辑，各个支付商签名方式可能不一样，所以交由各个子类实现

    }
}
