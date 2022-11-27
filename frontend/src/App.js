import { Routes, Route } from "react-router-dom";
import Login from "./pages/login/login";
import LoginPaciente from "./pages/user-page/user-page";
import Cadastro from "./pages/cadastro/paciente/identicacao/cadastro-identificacao";
import Localizacao from "./pages/cadastro/paciente/localizacao/cadastro-localizacao";
import DadosUsuario from "./pages/dados-usuario/identicacao/dados-identificacao.jsx";
import DadosLocalizacao from "./pages/dados-usuario/localizacao/dados-localizacao.jsx"


function App() {
  return (
    <Routes>
        <Route path="/">
          <Route index element={<Login/>} />
          <Route path="login" element={<Login/>} />
          <Route path="user-page" element={<LoginPaciente/>} />
          <Route path="user/dados" element={<DadosUsuario/>} />
          <Route path="user/dados/localizacao" element={<DadosLocalizacao/>} />
          <Route path="cadastro-identificacao" element={<Cadastro />} />
          <Route path="cadastro-localizacao" element={<Localizacao/>} />
        </Route>
    </Routes>
  );
}

export default App;
