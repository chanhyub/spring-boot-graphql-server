package com.example.springbootgraphqlserver.common;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.stereotype.Component;

@Component
public class CommonExceptionHandler extends DataFetcherExceptionResolverAdapter {

        @Override
        protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
                if (ex instanceof BadRequestException) {
                        return GraphqlErrorBuilder.newError()
                                .errorType(ErrorType.BAD_REQUEST)
                                .message(ex.getMessage())
                                .path(env.getExecutionStepInfo().getPath())
                                .location(env.getField().getSourceLocation())
                                .build();
                } else if (ex instanceof InternalErrorException) {
                        return GraphqlErrorBuilder.newError()
                                .errorType(ErrorType.INTERNAL_ERROR)
                                .message(ex.getMessage())
                                .path(env.getExecutionStepInfo().getPath())
                                .location(env.getField().getSourceLocation())
                                .build();
                } else if (ex instanceof Exception) {
                        ex.printStackTrace();
                        return GraphqlErrorBuilder.newError()
                                .errorType(ErrorType.INTERNAL_ERROR)
                                .message(ex.getMessage())
                                .path(env.getExecutionStepInfo().getPath())
                                .location(env.getField().getSourceLocation())
                                .build();
                } else {
                        return null;
                }
        }

}
