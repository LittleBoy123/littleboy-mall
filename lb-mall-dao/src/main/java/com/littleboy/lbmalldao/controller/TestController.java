package com.littleboy.lbmalldao.controller;

import com.littleboy.lbmalldao.dao.model.TBItem;
import com.littleboy.lbmalldao.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
   @Autowired
   IItemService iItemService;

   @RequestMapping("/test")
   public List<TBItem> test(){
      return iItemService.getDataByExample(null);
   }
}
