package com.cognizant.casestudy.loanapp.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
//@EnableJpaRepositories(basePackages= {"${spring.data.jpa.repository.packages}"})
public class LoanAppDataSourceConfig {
	
	// Data source creation
	@Primary
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource appDatSource() {
		return DataSourceBuilder.create().build();
	}
	
	// 
	/*
	 * @Bean
	 * 
	 * @ConfigurationProperties(prefix="spring.data.jpa.entity") public
	 * LocalContainerEntityManagerFactoryBean
	 * entityManagerFactory(EntityManagerFactoryBuilder builder, DataSource
	 * appDatSource) {
	 * 
	 * return builder.dataSource(appDatSource).build(); }
	 */
	
	// Security data source creation
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource securityDatSource() {
		return DataSourceBuilder.create().build();
	}

}
