package com.react.backend.data_input;

import com.react.backend.bbs.entity.BoardEntity;
import com.react.backend.bbs.repository.BoardRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

//@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
@Transactional
@Slf4j
public class BoardDataInsertTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    @Rollback(value = false)
    @DisplayName("단일 건수로 Board 100개 밀어넣기")
    void boardDataInsert() {

        for (int i = 0; i < 100; i++) {
            boardRepository.save(
                    BoardEntity.builder()
                            .title(i + "번째 게시글 입니다.")
                            .contents(i + " 번째 게시물의 내용입니다.")
                            .build());
        }
    }

    @Test
    @Rollback(value = false)
    @DisplayName("saveAll로 넣어보자! (100개)")
    void saveAllDataInsert() {
        List<BoardEntity> boardList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            boardList.add(BoardEntity.builder()
                    .title(i + "번째 게시글 입니다.")
                    .contents(i + " 번째 게시물의 내용입니다.")
                    .build());
        }

        boardRepository.saveAll(boardList);
    }

    @Test
    @DisplayName("게시물 가져오기")
    void findByBoardContents() {
        List<BoardEntity> boardList = boardRepository.findAll();
        System.out.println(boardList.toString());
    }
}
