package com.shaw.controller;

import com.shaw.pojo.Clothes;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("服饰相关操作")
@RequestMapping("/clothes")
public class ClothesController {

	@PostMapping("/save")
	public void save(@RequestBody Clothes clothes){

	}

	@PostMapping("/update")
	public void update(@RequestBody Clothes clothes){

	}
	@GetMapping("/list/{userid}/{type}")
	public void list(@PathVariable String userid, @PathVariable String type){

	}

	@DeleteMapping("/delete/{name}")
	public void delete(@PathVariable String name){

	}
}
