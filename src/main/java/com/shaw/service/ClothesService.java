package com.shaw.service;

import com.shaw.pojo.Clothes;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author sky
* @description 针对表【clothes】的数据库操作Service
* @createDate 2022-09-12 20:24:35
*/
public interface ClothesService extends IService<Clothes> {
	public List<Clothes> list(String userid, String type);
}
