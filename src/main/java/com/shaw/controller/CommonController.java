package com.shaw.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

@Api("图片的上传与回显")
@RestController
@RequestMapping("/common")
public class CommonController {

	@PostMapping("/upload/{id}")
	public void upload(@PathVariable String id, MultipartFile file){


	}
	@GetMapping("/download/{url}")
	public void download(@PathVariable String url, HttpServletResponse response){

	}
}
