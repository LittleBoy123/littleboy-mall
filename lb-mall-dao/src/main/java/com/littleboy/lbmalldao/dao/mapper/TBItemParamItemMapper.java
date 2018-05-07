package com.littleboy.lbmalldao.dao.mapper;




import com.littleboy.lbmalldao.dao.core.BaseMapper;
import com.littleboy.lbmalldao.dao.model.TBItemParamItem;
import com.littleboy.lbmalldao.dao.model.TBItemParamItemExample;
import org.apache.ibatis.annotations.Param;

public interface TBItemParamItemMapper extends BaseMapper {

    int updateByExampleWithBLOBs(@Param("record") TBItemParamItem record, @Param("example") TBItemParamItemExample example);

    int updateByPrimaryKeyWithBLOBs(TBItemParamItem record);

}