import { Routes, Route } from "react-router-dom";
import Login from "./pages/login/login";
import Cadastro from "./pages/cadastro/cadastro";

function App() {
  return (
    <Routes>
        <Route path="/">
          <Route path="login" element={<Login/>} />
          <Route path="cadastro" element={<Cadastro />} />
          {/* <Route path="contact" element={<Contact />} /> */}
          {/* <Route path="*" element={<NoPage />} /> */}
        </Route>
    </Routes>
  );
}

export default App;
