package com.react.backend.bbs.dto;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ResponsePaging<T> {

    private List<T> list = new ArrayList<>();
    private Pagination pagination;

    public ResponsePaging(List<T> list, Pagination pagination) {
        this.list.addAll(list);
        this.pagination = pagination;
    }

}