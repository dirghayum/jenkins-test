package com.axcelinno.quotecalc.quotecalc.dao;

import com.axcelinno.quotecalc.quotecalc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Component
public class PolicyDao {
//    private EntityManager entityManager;
//
//    @Autowired
//    public PolicyDao(EntityManager entityManager){
//        this.entityManager=entityManager;
//    }
//
//    public List<User> findUser(){
//        String sql = "Select * from user";
//        Query query = entityManager.createNativeQuery(sql,User.class);
//        return query.getResultList();
//    }
}
