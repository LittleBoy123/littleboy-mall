package com.littleboy.lbmalldao.dao.mapper;




import com.littleboy.lbmalldao.dao.core.BaseMapper;
import com.littleboy.lbmalldao.dao.model.TBContent;
import com.littleboy.lbmalldao.dao.model.TBContentExample;
import org.apache.ibatis.annotations.Param;

public interface TBContentMapper extends BaseMapper {


    int updateByExampleWithBLOBs(@Param("record") TBContent record, @Param("example") TBContentExample example);



    int updateByPrimaryKeyWithBLOBs(TBContent record);


}