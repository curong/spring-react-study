import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import BoardDetailPage from "./page/BoardDetailPage.jsx";
import BoardListPage from "./page/BoardListPage.jsx";
import BoardModifyPage from "./page/BoardModifyPage.jsx";

ReactDOM.createRoot(document.getElementById("root")).render(
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<BoardListPage />} />
      <Route path="/:idx" element={<BoardDetailPage />} />
      <Route path="/modify/:idx" element={<BoardModifyPage />} />
    </Routes>
  </BrowserRouter>
);
