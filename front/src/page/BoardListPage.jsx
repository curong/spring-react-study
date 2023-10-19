import React from "react";
import Wrap from "../components/Wrap";
import { useNavigate, useParams } from "react-router-dom";
import useAxios from "../hooks/useAxios";
import styled from "styled-components";

export default function BoardListPage() {
  const BoardHeader = styled.div`
    width: calc(100%-30px);
    min-height: calc(100%-30px);
    background-color: #fafafa;
    padding: 10px;
    border: 2px solid gray;
  `;
  const BoardBody = styled.div`
    display: flex;
    flex-direction: column;
    justify-content: start;
    align-items: center;
    width: calc(100%-30px);
    min-height: calc(100%-40px);
  `;

  const BoardContentsWrap = styled.div`
    display: flex;
    align-items: center;
    width: 100%;
    min-height: 15px;
    background-color: #fafafa;
    border: solid 2px gray;
    border-radius: 10px;
    margin-top: 10px;

    &:nth-child(1) {
      margin-top: 0px;
    }

    &:hover {
      background: cornflowerblue;
      transition: 0.5s;
      cursor: pointer;
    }
  `;

  const BoardContentsNumber = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    width: 15px;
    min-height: 15px;
    border-radius: 100%;
    padding: 10px;
    margin: 10px;
    background-color: #fafafa;
    border: 2px solid gray;
    border-radius: 100%;
  `;

  const BoardContentsTitle = styled.div`
    display: flex;
    align-items: center;
    width: 600px;
    height: 15px;
  `;

  const [result] = useAxios("/bbs/list");
  const navigate = useNavigate();

  console.log(result);

  const onClickHandler = (idx) => {
    navigate(`/${idx}`);
  };

  return (
    <Wrap>
      <BoardHeader>
        <BoardBody>
          {result
            ? result.map(({ idx, title }) => {
                return (
                  <BoardContentsWrap
                    onClick={(e) => onClickHandler(idx)}
                    idx={idx}
                    title={title}
                    key={idx}
                  >
                    <BoardContentsNumber>{idx}</BoardContentsNumber>
                    <BoardContentsTitle>{title}</BoardContentsTitle>
                  </BoardContentsWrap>
                );
              })
            : null}
        </BoardBody>
      </BoardHeader>
    </Wrap>
  );
}
