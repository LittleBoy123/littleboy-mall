package com.littleboy.lbmalldao.service;

import com.littleboy.lbmalldao.dao.mapper.RefundProcessingOrdersMapper;
import com.littleboy.lbmalldao.dao.model.RefundProcessingOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TestService {
   List<RefundProcessingOrders> selectAll(int pagNum,int pageSize);


}
