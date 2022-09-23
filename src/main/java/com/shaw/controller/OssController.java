package com.shaw.controller;

import com.shaw.service.OssService;
import com.shaw.utils.R;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/oss/fileoss")
@CrossOrigin
@Slf4j
public class OssController {

    @Autowired
    private OssService ossService;

    //上传头像的方法
    @PostMapping(value = "/", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public R uploadOssFile(@ApiParam(value = "文件", required = true)@RequestPart("file")MultipartFile file){
        //获取文件上传 MultipartFile
        //返回上传到oss的路径
        log.info("文件上传成功");

        String url = ossService.uploadFileAvatar(file);

        return R.ok().data("url",url);
    }
}