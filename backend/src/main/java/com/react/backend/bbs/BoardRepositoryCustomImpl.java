package com.react.backend.bbs;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.react.backend.bbs.dto.QResponseBoardListDto;
import com.react.backend.bbs.dto.ResponseBoardListDto;
import com.react.backend.bbs.entity.QBoardEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Transactional
public class BoardRepositoryCustomImpl implements BoardRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<ResponseBoardListDto> getBoardList(Pageable pageable) {
        QBoardEntity board = QBoardEntity.boardEntity;

        return jpaQueryFactory
                .select(new QResponseBoardListDto(board.idx, board.title))
                .from(board)
                .orderBy(board.idx.desc())
                .offset(1)
                .limit(10)
                .fetch();
    }
}
