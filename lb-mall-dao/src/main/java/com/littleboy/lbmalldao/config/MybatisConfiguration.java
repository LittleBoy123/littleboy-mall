package com.littleboy.lbmalldao.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages={"com.littleboy.lbmalldao.dao"},sqlSessionFactoryRef="sqlSessionFactory")
public class MybatisConfiguration {

	@Value("${mybatis.configLocation}")
	private String configlocation;
	
	@Value("${mybatis.mapperLocations}")
	private String mapperLocations;

	@Bean(name="sqlSessionFactory")
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) throws IOException {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		// 设置mybatis的主配置文件
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setConfigLocation(resolver.getResource(configlocation));
		sqlSessionFactoryBean.setMapperLocations(resolver.getResources(mapperLocations));

		return sqlSessionFactoryBean;
	}
	
	
	@Bean
    public DataSourceTransactionManager annotationDrivenTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
