package com.react.backend.bbs.entity;

import com.react.backend.bbs.dto.ResponseBoardDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String title;

    @Lob
    private String contents;

    public ResponseBoardDto transferDto(BoardEntity board) {
        return ResponseBoardDto.builder()
                .idx(board.getIdx())
                .title(board.getTitle())
                .contents(board.getContents())
                .build();
    }


}
