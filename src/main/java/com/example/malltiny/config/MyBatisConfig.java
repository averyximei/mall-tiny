package com.example.malltiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.example.malltiny.mbg.mapper","com.example.malltiny.mbg.dao"})
public class MyBatisConfig {
}
