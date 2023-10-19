package com.react.backend.bbs.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.react.backend.bbs.dto.QResponseBoardDto is a Querydsl Projection type for ResponseBoardDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QResponseBoardDto extends ConstructorExpression<ResponseBoardDto> {

    private static final long serialVersionUID = 1659061594L;

    public QResponseBoardDto(com.querydsl.core.types.Expression<Long> idx, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> contents) {
        super(ResponseBoardDto.class, new Class<?>[]{long.class, String.class, String.class}, idx, title, contents);
    }

}

