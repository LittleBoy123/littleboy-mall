package com.littleboy.lbmalldao.service.impl;

import com.littleboy.lbmalldao.dao.core.plugins.page.Page;
import com.littleboy.lbmalldao.dao.mapper.RefundProcessingOrdersMapper;
import com.littleboy.lbmalldao.dao.model.RefundProcessingOrders;
import com.littleboy.lbmalldao.dao.model.RefundProcessingOrdersExample;
import com.littleboy.lbmalldao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
   @Autowired
   RefundProcessingOrdersMapper mapper;

   @Override
   public List<RefundProcessingOrders> selectAll(int pagNum,int pageSize) {
      RefundProcessingOrdersExample example = new RefundProcessingOrdersExample();
      Page<RefundProcessingOrders> page = new Page<RefundProcessingOrders>(pagNum,pageSize);
      page.setResult(mapper.selectByExample(example,page));
      return  page.getResult();
   }
}
