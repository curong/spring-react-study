import { useNavigate, useParams } from "react-router-dom";
import React, { useState } from "react";
import Wrap from "../components/Wrap";
import styled from "styled-components";

export default function BoardModifyPage() {
  const BoardWrap = styled.div`
    flex-direction: column;
    margin: 0 auto;
    width: 1280px;
    height: 768px;
    border-radius: 5px;
  `;

  const BoardNumber = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    width: 10px;
    height: 10px;
    padding: 15px;
    border-radius: 100%;
    border: 2px solid gray;
    margin-right: 10px;
    margin-left: -10px;
  `;

  const BoardTitle = styled.div`
    display: flex;
    justify-content: start;
    align-items: center;
    width: calc(1280px-20px);
    height: 30px;
    padding: 20px;
    border: 2px solid gray;
    border-top-left-radius: 5px;
    border-top-right-radius: 5px;
    font-size: larger;
  `;

  const BoardTitleInput = styled.input`
    display: flex;
    justify-content: start;
    align-items: center;
    width: calc(1280px-20px);
    height: 30px;
    padding: 20px;
    border: 2px solid gray;
    border-top-left-radius: 5px;
    border-top-right-radius: 5px;
    font-size: larger;
  `;

  const BoardContents = styled.div`
    width: calc(100%-20px);
    min-height: calc(640px - 40px);
    border-left: 2px solid gray;
    border-right: 2px solid gray;
    border-bottom: 2px solid gray;
    padding: 20px;
  `;

  const BoardMenuBar = styled.div`
    float: right;
    display: flex;
    justify-content: space-between;
    align-items: center;
    width: 300px;
    height: 50px;
    border-left: 2px solid gray;
    border-right: 2px solid gray;
    border-bottom: 2px solid gray;
    border-bottom-left-radius: 10px;
    border-bottom-right-radius: 10px;
  `;

  const Button = styled.button`
    display: flex;
    justify-content: center;
    align-items: center;
    width: 50%;
    height: 40px;
    padding: 20px;
    border-radius: 5px;
    margin-left: 5px;
    margin-right: 5px;
    background-color: ${(props) => props.background};
    & {
      :nth-child(1) {
        margin-left: 0px;
      }
    }
  `;

  const { idx } = useParams();
  const [title, setTitle] = useState(null);
  const [contents, setContents] = useState(null);
  const navigate = useNavigate();
  const titleOnChangeHandler = (e) => {
    console.log(title);
    setContents([title, ...e.target.value]);
  };

  const contentsOnChangeHandler = (e) => {
    setContents({...e.target.value});
  };
  return (
    <Wrap>
      <BoardWrap>
        <BoardTitle>
          <BoardNumber>{idx}</BoardNumber>
          <BoardTitleInput
            type="text"
            value={title}
            onChange={titleOnChangeHandler}
          ></BoardTitleInput>
        </BoardTitle>
        <BoardContents>{contents}</BoardContents>
        <BoardMenuBar>
          <Button
            background="#ffc847"
            onClick={(e) => {
              navigate(`/modify/${idx}`);
            }}
          >
            초기화
          </Button>
          <Button
            background="#7be95d"
            onClick={(e) => {
              navigate(`/`);
            }}
          >
            수정완료
          </Button>
        </BoardMenuBar>
      </BoardWrap>
    </Wrap>
  );
}
