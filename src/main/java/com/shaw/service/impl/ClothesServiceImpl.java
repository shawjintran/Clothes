package com.shaw.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shaw.pojo.Clothes;
import com.shaw.service.ClothesService;
import com.shaw.mapper.ClothesMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author sky
* @description 针对表【clothes】的数据库操作Service实现
* @createDate 2022-09-12 20:24:35
*/
@Service
public class ClothesServiceImpl extends ServiceImpl<ClothesMapper, Clothes>
    implements ClothesService{
	public List<Clothes> list(String userid, String type){
		LambdaQueryWrapper<Clothes> wrapper = new LambdaQueryWrapper<>();
		wrapper.eq(Clothes::getUserId,userid)
				.eq(Clothes::getType,type);
		return list(wrapper);

	}
}




