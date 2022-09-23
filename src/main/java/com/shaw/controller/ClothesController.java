package com.shaw.controller;

import com.shaw.pojo.Clothes;
import com.shaw.pojo.R;
import com.shaw.service.impl.ClothesServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("服饰相关操作")
@RequestMapping("/clothes")
public class ClothesController {

	@Autowired
	private ClothesServiceImpl clothesService;

	@PostMapping("/save")
	public R save(@RequestBody Clothes clothes){
		clothesService.save(clothes);
		return R.ok();
	}

	@PostMapping("/update")
	public R update(@RequestBody Clothes clothes){
		clothesService.updateById(clothes);
		return R.ok();
	}
	@GetMapping("/list/{userid}/{type}")
	@ApiOperation("将获取的衣服数据list，封装到R中，进行返回，以'list'作为key值")
	public R list(@PathVariable String userid, @PathVariable String type){
		return R.ok().data("clotheslist",clothesService.list(userid,type));
	}

	@DeleteMapping("/delete/{id}")
	public R delete(@PathVariable String id){
		clothesService.removeById(id);
		return R.ok();
	}
}
