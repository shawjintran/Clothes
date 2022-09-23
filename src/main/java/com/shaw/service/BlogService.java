package com.shaw.service;

import com.shaw.pojo.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author sky
* @description 针对表【blog】的数据库操作Service
* @createDate 2022-09-12 20:19:55
*/
public interface BlogService extends IService<Blog> {
	public List<Blog> list(String userid);
}
