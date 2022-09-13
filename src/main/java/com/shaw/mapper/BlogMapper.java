package com.shaw.mapper;

import com.shaw.pojo.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author sky
* @description 针对表【blog】的数据库操作Mapper
* @createDate 2022-09-12 20:19:55
* @Entity com.shaw.pojo.Blog
*/
@Mapper
public interface BlogMapper extends BaseMapper<Blog> {

}




