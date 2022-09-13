package com.shaw.mapper;

import com.shaw.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author sky
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-09-12 20:26:52
* @Entity com.shaw.pojo.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




