package com.react.backend.bbs.dto;

import com.querydsl.core.annotations.QueryProjection;
import com.react.backend.bbs.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ResponseBoardDto {
    Long idx;
    String title;
    String contents;


    @QueryProjection
    public ResponseBoardDto(Long idx, String title, String contents) {
        this.idx = idx;
        this.title = title;
        this.contents = contents;
    }

}
