package com.lazyfighter.tx;

import javax.sql.DataSource;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class TxConfigure {

	@Bean
	public TransactionManager transactionManager(DataSource dataSource){
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean
	public DataSource dataSource(){
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false",
				"root", "123456");
	}
}
