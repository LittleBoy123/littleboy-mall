package com.littleboy.lbmalldao.dao.mapper;



import com.littleboy.lbmalldao.dao.core.BaseMapper;
import com.littleboy.lbmalldao.dao.model.TBItemDesc;
import com.littleboy.lbmalldao.dao.model.TBItemDescExample;
import org.apache.ibatis.annotations.Param;

public interface TBItemDescMapper extends BaseMapper {

    int updateByExampleWithBLOBs(@Param("record") TBItemDesc record, @Param("example") TBItemDescExample example);

    int updateByPrimaryKeyWithBLOBs(TBItemDesc record);
}