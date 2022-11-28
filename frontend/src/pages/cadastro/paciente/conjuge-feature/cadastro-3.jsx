import React from "react";
import "./cadastro-3-style.css";

  const CadastroConjugePage = () => {
    return(
        <div>
            <h1>CADASTRO DE PACIENTE</h1>
            <div className="container">
                <h2>DADOS DE IDENTIFICAÇÃO</h2>
                <div className="form">
                    <h1>LOGIN</h1>
                    <label for="Conjuge">Cônjuge</label> 
                    <input type="text" placeholder="Nome do(a) Marido/Esposa"/>
                    {/* placeholder é uma "dica" para orientar o usuário o que digitar */}
                    <label for="Filiacao">Filiação</label>
                    <label for="Pai">Pai</label>
                    <input type="text" placeholder="Nome completo do pai"/>
                    <label for="Mae">Mãe</label>
                    <input type="text" placeholder="Nome completo do mãe"/>
                    <input type="submit" value="Finalizar cadastro"/>            
                </div>
            </div>
        </div>    
    );
}

export default CadastroConjugePage;