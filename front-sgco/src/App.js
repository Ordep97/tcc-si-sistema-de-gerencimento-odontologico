import { Routes, Route } from "react-router-dom";
import Login from "./pages/login/login";
import LoginPaciente from "./pages/login/login-paciente/login-paciente";
import Cadastro from "./pages/cadastro/paciente/identicacao/cadastro-identificacao";
import Localizacao from "./pages/cadastro/paciente/localizacao/cadastro-localizacao";


function App() {
  return (
    <Routes>
        <Route path="/">
          <Route path="login" element={<Login/>} />
          <Route path="login-paciente" element={<LoginPaciente/>} />
          <Route path="cadastro-identificacao" element={<Cadastro />} />
          <Route path="cadastro-localizacao" element={<Localizacao/>} />
        </Route>
    </Routes>
  );
}

export default App;
