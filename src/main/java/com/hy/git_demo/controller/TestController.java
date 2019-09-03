package com.hy.git_demo.controller;

import com.hy.git_demo.util.ResponseData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("test")
    public ResponseData test(){
       ResponseData responseData=new ResponseData();
       responseData.setMessage("成功了！");
       return responseData;
    }
}
