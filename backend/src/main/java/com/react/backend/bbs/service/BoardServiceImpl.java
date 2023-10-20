package com.react.backend.bbs.service;

import com.react.backend.bbs.dto.ResponseBoardDto;
import com.react.backend.bbs.dto.ResponseBoardListDto;
import com.react.backend.bbs.entity.BoardEntity;
import com.react.backend.bbs.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    @Override
    public List<ResponseBoardListDto> getBoardListPage(Pageable pageable) {
        return boardRepository.getBoardList(pageable);
    }

    @Override
    public ResponseBoardDto getBoardDetail(Long idx) {
        return new BoardEntity().transferDto(boardRepository.findById(idx).orElse(null));
    }
}
