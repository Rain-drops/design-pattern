package org.sgj.templatemethodpattern.demo.two;

import org.springframework.stereotype.Service;

@Service
public abstract class AbstractPayTemplateServiceImpl implements IPayTemplateService {

    @Override
    public void createOrder(Object obj) {
        // 创建订单的逻辑
        System.out.println(String.format("创建%s类型的订单", getPayType().getCode()));
    }

    /**
     * 主方法，里边组织各个方法的调用逻辑
     *
     * @param obj
     */
    @Override
    public void doPay(Object obj) {

        // 1.签名，各个支付商签名方式可能不一样，所以交由各个子类实现
        sign(obj);

        // 2.创建订单，创建订单的逻辑大致一致，可以在抽象类中实现，如有不一致的可再子类中重写
        // 默认调用抽象类中实现的
        createOrder(obj);

        // 3.支付的逻辑，各个支付商签名方式可能不一样，所以交由各个子类实现
        pay(obj);
    }
}
