package com.react.backend.bbs;

import com.react.backend.bbs.dto.ResponseBoardDto;
import com.react.backend.bbs.dto.ResponseBoardListDto;
import com.react.backend.bbs.entity.BoardEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BoardService {
    List<ResponseBoardListDto> getBoardListPage(Pageable pageable);
    ResponseBoardDto getBoardDetail(Long idx);
}
