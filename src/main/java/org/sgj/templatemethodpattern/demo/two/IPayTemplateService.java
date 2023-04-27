package org.sgj.templatemethodpattern.demo.two;

public interface IPayTemplateService {

    /**
     * 支持的支付类型
     *
     * @return
     */
    PayEnum getPayType();

    /**
     * 签名
     *
     * @param obj
     * @return
     */
    String sign(Object obj);

    /**
     * 创建订单
     *
     * @param obj
     */
    void createOrder(Object obj);

    /**
     * 具体的支付逻辑
     *
     * @param obj
     */
    void pay(Object obj);

    /**
     * 支付主方法
     *
     * @param obj
     */
    void doPay(Object obj);
}
