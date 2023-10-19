package com.react.backend.bbs.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.react.backend.bbs.dto.QResponseBoardListDto is a Querydsl Projection type for ResponseBoardListDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QResponseBoardListDto extends ConstructorExpression<ResponseBoardListDto> {

    private static final long serialVersionUID = -1618494884L;

    public QResponseBoardListDto(com.querydsl.core.types.Expression<Long> idx, com.querydsl.core.types.Expression<String> title) {
        super(ResponseBoardListDto.class, new Class<?>[]{long.class, String.class}, idx, title);
    }

}

