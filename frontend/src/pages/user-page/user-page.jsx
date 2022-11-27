import React from "react";
import "./user-page-style.css";
import dadospaciente from '../../assets/user-page/dados-paciente.png';
import consultaspaciente from '../../assets/user-page/consultas-paciente.png'


  const LoginPacientePage = () => {
    return(


        <div class="container-user-page">

            <h1>Bem vindo, "Usuário"...</h1>

                <div class="consultas">

                    <section class="meus-dados">
                        <div class="dados-paciente-img">
                            <img src={dadospaciente} alt="dados-paciente-img"></img>
                        </div>
                        <h2>Altere aqui seus dados já cadastrados</h2>
                        <p>Aqui poderá visualizar e alterar os seus dados cadastrados.</p>
                        <a href="/user/dados"><input type="submitMeusDados" value="Meus dados"/> </a>
                    </section>

                    <section class="minhas-consultas">
                        <div class="consultas-paciente-img">
                            <img src={consultaspaciente} alt="consultas-paciente-img"></img>
                        </div>
                        <h2>Veja todas as consultas que tem marcadas</h2>
                        <p>Aqui você poderá visualizar e/ou excluir consultas marcadas para você.</p>
                        <input type="submitMinhasConsultas" value="Minhas consultas"/>

                    </section>

                </div>

        </div>    
    );
}

export default LoginPacientePage;