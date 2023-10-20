package com.react.backend.bbs.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseBoardListDto {
    Long idx;
    String title;
    SearchDto searchDto;

    @QueryProjection
    public ResponseBoardListDto(Long idx, String title) {
        this.idx = idx;
        this.title = title;
    }
}
