package com.shaw.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shaw.pojo.Blog;
import com.shaw.pojo.Clothes;
import com.shaw.service.BlogService;
import com.shaw.mapper.BlogMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author sky
* @description 针对表【blog】的数据库操作Service实现
* @createDate 2022-09-12 20:19:55
*/
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog>
    implements BlogService{
	public List<Blog> list(String userid){
		LambdaQueryWrapper<Blog> wrapper = new LambdaQueryWrapper<>();
		wrapper.eq(Blog::getUserId,userid);
		return list(wrapper);
	}
}




