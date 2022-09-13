package com.shaw.mapper;

import com.shaw.pojo.Clothes;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author sky
* @description 针对表【clothes】的数据库操作Mapper
* @createDate 2022-09-12 20:24:35
* @Entity com.shaw.pojo.Clothes
*/
@Mapper
public interface ClothesMapper extends BaseMapper<Clothes> {

}




