package com.example.excl.controller;


import com.example.excl.service.OrgService;
import com.example.excl.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by hanjunshuang on 2018/12/14.
 */
@RestController
@RequestMapping("/excel")
public class TestExcel {

    @Autowired
    ExcelUtil excelUtil;

    @RequestMapping("{orgUuid}")
    public void test(@PathVariable String orgUuid,HttpServletResponse response){
        excelUtil.getHSSFWorkbook(orgUuid,response);
    }
}
