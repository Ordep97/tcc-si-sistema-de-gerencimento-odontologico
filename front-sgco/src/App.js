import { Routes, Route } from "react-router-dom";
import Login from "./pages/login/login";
import Cadastro from "./pages/cadastro/paciente/identicacao/cadastro";
import Localizacao from "./pages/cadastro/paciente/localizacao/cadastro-2";
import Conjuge from "./pages/cadastro/paciente/conjuge/cadastro-3";

function App() {
  return (
    <Routes>
        <Route path="/">
          <Route path="login" element={<Login/>} />
          <Route path="cadastro" element={<Cadastro />} />
          <Route path="cadastro-2" element={<Localizacao/>} />
          <Route path="cadastro-3" element={<Conjuge/>} />
          {/* <Route path="contact" element={<Contact />} /> */}
          {/* <Route path="*" element={<NoPage />} /> */}
        </Route>
    </Routes>
  );
}

export default App;
