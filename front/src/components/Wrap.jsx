import React from "react";
import styled from "styled-components";

export default function Wrap({ children }) {
  const Wrap = styled.div`
    width: 100%;
    min-height: 100vh;
    margin: 0 auto;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
  `;

  const Container = styled.div`
    width: 1280px;
    padding: 20px;
    border: 2px solid gray;
    border-radius: 10px;
  `;

  return (
    <Wrap>
      <Container>{children}</Container>
    </Wrap>
  );
}
