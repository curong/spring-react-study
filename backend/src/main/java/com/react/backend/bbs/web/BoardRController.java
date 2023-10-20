package com.react.backend.bbs.web;

import com.react.backend.bbs.dto.ResponseBoardListDto;
import com.react.backend.bbs.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/bbs")
@RequiredArgsConstructor
public class BoardRController {

    private final BoardService boardService;
    @GetMapping("/list")
    public ResponseEntity<?> boardList(Pageable pageable) {
        List<ResponseBoardListDto> boardListPage = boardService.getBoardListPage(pageable);
        return ResponseEntity.ok(boardListPage);
    }

    @GetMapping("/{idx}")
    public ResponseEntity<?> boardDetail(@PathVariable(value = "idx") Long idx) {
        return ResponseEntity.ok(boardService.getBoardDetail(idx));
    }

}
