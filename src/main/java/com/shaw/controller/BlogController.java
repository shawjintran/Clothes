package com.shaw.controller;

import com.shaw.pojo.Blog;
import com.shaw.service.impl.BlogServiceImpl;
import com.shaw.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("博文相关操作")
@RestController
@RequestMapping("/blog")
public class BlogController {

	@Autowired
	private BlogServiceImpl blogService;

	@GetMapping("/list/{userid}")
	@ApiOperation("展示当前用户的全部文章")
	public R list(@PathVariable String userid){
		return R.ok().data("articlelist",blogService.list(userid));
	}
	@PostMapping("/save")
	@ApiOperation("保存文章")
	public R save(@RequestBody Blog blog){
		blogService.save(blog);
		return R.ok();
	}
	@PostMapping("/edit")
	@ApiOperation("编辑指定id更改文章")
	public R edit(@RequestBody Blog blog){
		blogService.updateById(blog);
		return R.ok();
	}
	@DeleteMapping("/delete/{id}")
	@ApiOperation("删除指定id的文章")
	public R delete(@PathVariable String id){
		blogService.removeById(id);
		return R.ok();
	}
	@PutMapping("/flavor")
	@ApiOperation("展示用户喜欢的文章")
	public void flavor(){

	}
	@PutMapping("/comment")
	@ApiOperation("展示文章下面的所有评论")
	public void comment(){

	}

}
