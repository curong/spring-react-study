import axios from "axios";
import { useEffect, useState } from "react";

export default function useAxios(inItPath) {
  const [path, setpath] = useState(inItPath);
  const [result, setResult] = useState("");

  const fetchResponse = () =>
    axios
      .get(import.meta.env.VITE_BACKEND_HOST + path)
      .then(({ data }) => setResult(data));

  useEffect(() => {
    fetchResponse();
  }, []);

  return [result];
}
