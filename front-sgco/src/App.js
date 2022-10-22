import { Routes, Route } from "react-router-dom";
import Login from "./pages/login/login";
import Cadastro from "./pages/cadastro/paciente/identicacao/cadastro-identificacao";
import Localizacao from "./pages/cadastro/paciente/localizacao/cadastro-localizacao";
import Conjuge from "./pages/cadastro/paciente/conjuge/cadastro-3";

function App() {
  return (
    <Routes>
        <Route path="/">
          <Route path="login" element={<Login/>} />
          <Route path="cadastro-identificacao" element={<Cadastro />} />
          <Route path="cadastro-localizacao" element={<Localizacao/>} />
          <Route path="cadastro-3" element={<Conjuge/>} />
          {/* <Route path="contact" element={<Contact />} /> */}
          {/* <Route path="*" element={<NoPage />} /> */}
        </Route>
    </Routes>
  );
}

export default App;
