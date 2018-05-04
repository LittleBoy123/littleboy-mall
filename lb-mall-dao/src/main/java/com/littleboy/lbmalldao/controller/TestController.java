package com.littleboy.lbmalldao.controller;

import com.littleboy.lbmalldao.dao.model.RefundProcessingOrders;
import com.littleboy.lbmalldao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

   @Autowired
   TestService service;

   @RequestMapping("/test")
   public List<RefundProcessingOrders> test(int num,int size){
      return service.selectAll(num,size);
   }
}
