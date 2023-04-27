package org.sgj.templatemethodpattern.demo.two;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class PayTemplateController {

    @Resource
    private Map<PayEnum, IPayTemplateService> payTemplateServicesMap;

    @PostMapping("/dopay")
    public String doPay(){
        payTemplateServicesMap.get(PayEnum.ALIPAY).doPay(new Object());
        return null;
    }
}
