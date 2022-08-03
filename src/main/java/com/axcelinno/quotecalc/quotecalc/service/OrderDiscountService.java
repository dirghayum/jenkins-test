package com.axcelinno.quotecalc.quotecalc.service;

import com.axcelinno.quotecalc.quotecalc.dao.PolicyDao;
import com.axcelinno.quotecalc.quotecalc.model.OrderDiscount;
import com.axcelinno.quotecalc.quotecalc.model.OrderRequest;
import com.axcelinno.quotecalc.quotecalc.model.User;
import lombok.RequiredArgsConstructor;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderDiscountService {

    @Autowired
    private KieContainer kieContainer;

    public OrderDiscount getDiscount(OrderRequest orderRequest) {
        OrderDiscount orderDiscount = new OrderDiscount();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("orderDiscount", orderDiscount);
        kieSession.insert(orderRequest);
        kieSession.fireAllRules();
        kieSession.dispose();
        return orderDiscount;
    }

//    private final PolicyDao policyDao;
//
//    public List<User> getUser(String userName){
//        return PolicyDao.getUser(userName);
//    }
}
