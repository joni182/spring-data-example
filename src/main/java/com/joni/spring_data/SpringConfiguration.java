package com.joni.spring_data;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import ch.qos.logback.core.db.DriverManagerConnectionSource;

@EnableJpaRepositories("com.joni")
@EnableTransactionManagement
@ComponentScan("com.joni")
public class SpringConfiguration {

	@Bean
	public DataSource dataSource(){
		
		DriverManagerConnectionSource dataSource = new DriverManagerConnectionSource();
		dataSource.setDriverClass("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/pruebas01");
		dataSource.setUser("postgres");
		dataSource.setPassword("admin");
		return (DataSource) dataSource;
	}
	
	@Bean
    LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
 
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource);
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan("com.joni.spring_data");
 
        Properties jpaProperties = new Properties();
 
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
 
        entityManagerFactoryBean.setJpaProperties(jpaProperties);
 
        return entityManagerFactoryBean;
         
    }
	
	@Bean public PlatformTransactionManager transactionManager() {
        
        JpaTransactionManager txManager= new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory(dataSource()).getObject());
        return txManager;
         
    }
}
