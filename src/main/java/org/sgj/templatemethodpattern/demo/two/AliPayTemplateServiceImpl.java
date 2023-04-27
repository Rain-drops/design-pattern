package org.sgj.templatemethodpattern.demo.two;

import org.springframework.stereotype.Service;

@Service
public class AliPayTemplateServiceImpl extends AbstractPayTemplateServiceImpl {

    @Override
    public PayEnum getPayType() {
        return PayEnum.ALIPAY;
    }

    @Override
    public String sign(Object obj) {
        return null;
    }

    @Override
    public void pay(Object obj) {

    }


}
