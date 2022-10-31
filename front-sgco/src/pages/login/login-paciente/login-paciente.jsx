import React from "react";
import "./login-paciente-style.css";


  const LoginPacientePage = () => {
    return(


        <div class="container-login-paciente">

            <h1>Bem vindo, "Usuário"...</h1>

                <div class="consultas">
                    <section class="meus-dados">
                    <h2>Altere aqui seus dados já cadastrados</h2>
                    <p>Aqui poderá visualizar e alterar os seus dados cadastrados.</p>
                    <input type="submitMeusDados" value="Meus dados"/>

                </section>

                <section class="minhas-consultas">

                    <h2>Veja todas as consultas que tem marcadas</h2>
                    <p>Aqui você poderá visualizar e/ou excluir consultas marcadas para você.</p>
                    <input type="submitMinhasConsultas" value="Minhas consultas"/>

                </section>

                </div>

        </div>    
    );
}

export default LoginPacientePage;