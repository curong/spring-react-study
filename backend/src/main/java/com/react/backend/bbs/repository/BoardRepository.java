package com.react.backend.bbs.repository;

import com.react.backend.bbs.repository.custom.BoardRepositoryCustom;
import com.react.backend.bbs.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long>, BoardRepositoryCustom {
}
