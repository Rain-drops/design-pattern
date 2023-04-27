package org.sgj.strategypattern.demo.two;

public interface IPayStrategyService {

    /**
     * 支持的支付类型
     *
     * @return
     */
    PayEnum getPayType();

    /**
     * 具体的支付逻辑
     *
     * @param obj
     */
    void pay(Object obj);

}
