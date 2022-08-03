package com.axcelinno.quotecalc.quotecalc.controller;

import com.axcelinno.quotecalc.quotecalc.model.OrderDiscount;
import com.axcelinno.quotecalc.quotecalc.model.OrderRequest;
import com.axcelinno.quotecalc.quotecalc.model.User;
import com.axcelinno.quotecalc.quotecalc.repo.UserRepository;
import com.axcelinno.quotecalc.quotecalc.service.OrderDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class OrderDiscountController {

    @Autowired
    private OrderDiscountService orderDiscountService;

    @PostMapping("/get-discount")
    public ResponseEntity<OrderDiscount> getDiscount(@RequestBody OrderRequest orderRequest) {
        OrderDiscount discount = orderDiscountService.getDiscount(orderRequest);
        return new ResponseEntity<>(discount, HttpStatus.OK);
    }

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") long id) {
        Optional<User> userData = userRepo.findById(id);
        if (userData.isPresent()) {
            return new ResponseEntity<>(userData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
