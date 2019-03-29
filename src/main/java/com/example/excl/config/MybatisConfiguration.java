package com.example.excl.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.excl.mapper")
public class MybatisConfiguration {
}
