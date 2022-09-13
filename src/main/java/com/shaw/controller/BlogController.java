package com.shaw.controller;

import com.shaw.pojo.Blog;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Api("博文相关操作")
@RestController
@RequestMapping("/blog")
public class BlogController {
	@GetMapping("/list/{userid}")
	public void list(@PathVariable String userid){

	}
	@PostMapping("/save")
	public void save(@RequestBody Blog blog){}
	@PostMapping("/edit")
	public void edit(@RequestBody Blog blog){}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id){

	}
	@PutMapping("/flavor")
	public void flavor(){

	}
	@PutMapping("/comment")
	public void comment(){

	}

}
