package com.littleboy.lbmalldao.service.impl;

import com.littleboy.lbmalldao.dao.model.TBItem;
import com.littleboy.lbmalldao.dao.model.TBItemExample;
import com.littleboy.lbmalldao.service.IItemService;
import org.springframework.stereotype.Service;

@Service("itemservice")
public class ItemServiceImpl extends BaseServiceImpl<TBItem,Long,TBItemExample> implements IItemService {


}
