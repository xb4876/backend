package com.renwu.backend.demo.controller;

import com.renwu.backend.demo.service.ThreatReportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api(value = "AppController", description = "app接口")
@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private ThreatReportService service;



    //简单的后台接口，用于测试
    @ApiOperation(notes = "", httpMethod = "POST", value = "app信息")
    @RequestMapping("/info")
    public Object info(String id){
        Map<String,Object> map = new HashMap<>();
        map.put(id,"hello hello hello");
        return map;
    }

    //查询数据库，用于测试
    @ApiOperation(notes = "", httpMethod = "POST", value = "威胁情报")
    @RequestMapping("/getReports")
    public Object getReports(){
        return service.getReports();
    }

}