package org.sgj.templatemethodpattern.demo.two;

import org.springframework.stereotype.Service;

@Service
public class WxPayTemplateServiceImpl extends AbstractPayTemplateServiceImpl {
    @Override
    public PayEnum getPayType() {
        return PayEnum.WECHATPAY;
    }

    @Override
    public String sign(Object obj) {
        return null;
    }

    @Override
    public void pay(Object obj) {

    }
}
