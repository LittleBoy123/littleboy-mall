package com.littleboy.lbmalldao.dao.mapper;




import com.littleboy.lbmalldao.dao.core.BaseMapper;
import com.littleboy.lbmalldao.dao.model.TBItemParam;
import com.littleboy.lbmalldao.dao.model.TBItemParamExample;
import org.apache.ibatis.annotations.Param;

public interface TBItemParamMapper extends BaseMapper {

    int updateByExampleWithBLOBs(@Param("record") TBItemParam record, @Param("example") TBItemParamExample example);

    int updateByPrimaryKeyWithBLOBs(TBItemParam record);

}