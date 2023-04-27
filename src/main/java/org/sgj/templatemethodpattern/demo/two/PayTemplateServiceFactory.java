package org.sgj.templatemethodpattern.demo.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class PayTemplateServiceFactory {

    @Resource
    private List<IPayTemplateService> payServices;

    @Bean("payTemplateServicesMap")
    public Map<PayEnum, IPayTemplateService> payTemplateServicesMap(){

        Map<PayEnum, IPayTemplateService> map = new HashMap<>();
        payServices.stream().forEach(p -> {
            map.put(p.getPayType(), p);
        });
        return map;
    }
}
