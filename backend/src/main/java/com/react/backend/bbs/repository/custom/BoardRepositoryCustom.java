package com.react.backend.bbs.repository.custom;

import com.react.backend.bbs.dto.ResponseBoardListDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BoardRepositoryCustom {

    List<ResponseBoardListDto> getBoardList(Pageable pageable);
    Long getTotalBoardCount();
}
