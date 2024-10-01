package com.example.springbootgraphqlserver.config;

import graphql.scalars.ExtendedScalars;
import com.example.springbootgraphqlserver.common.CommonExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

@Configuration
public class GraphQlConfig {

    @Bean
    public DataFetcherExceptionResolverAdapter dataFetcherExceptionResolverAdapter() {
        return new CommonExceptionHandler();
    }

    @Bean
    public RuntimeWiringConfigurer runtimeWiringConfigurer() {
        return wiringBuilder -> wiringBuilder.scalar(ExtendedScalars.GraphQLLong);
    }

}
