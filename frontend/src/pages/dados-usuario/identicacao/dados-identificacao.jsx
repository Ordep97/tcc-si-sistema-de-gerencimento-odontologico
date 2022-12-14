import React from "react";
import "./dados-identificacao-style.css";

const CadastroIdentificacaoPage = () => {
    return (
            <section class="container-identificacao">

                <form class="form-identificacao">

                    <h2>DADOS DE IDENTIFICAÇÃO</h2>

                    <label for="nome">Nome:</label>
                    <input type="text" class="nameClient" placeholder="Nome Completo" />

                    <label for="CPF">CPF:</label>
                    <input type="text" id="campo_cpf" placeholder="000.000.000-00" autocomplete="off" required />

                    <label for="Sexo">Selecione sexo:</label>
                    <select id="Sexo">
                        <option value="Masculino">Masculino</option>
                        <option value="Feminino">Feminino</option>
                        <option value="Transgênero">Transgênero</option>
                        <option value="Gênero neutro">Gênero neutro</option>
                    </select>

                    <label for="Data de nascimento">Data de Nascimento: </label>
                    <input type="date" name="Data de nascimento" id="Data de nascimento" />

                    <label>Celular:</label>
                    <input type="text" id="campo_celular" placeholder="Apenas Números" maxlength="11" required />

                    <label>Telefone Fixo:</label>
                    <input type="text" id="campo_fixo" placeholder="Apenas Números" maxlength="10" />

                    <label>E-mail:</label>
                    <input type="email" name="email" placeholder="example@example.com" required />

                    <label>Estado Civil:</label>
                    <select id="estado civil">
                        <option value="Solteiro">Solteiro(a)</option>
                        <option value="Casado">Casado(a)</option>
                        <option value="Viúvo">Viúvo(a)</option>
                    </select>

                    <a href="/user/dados/localizacao"><input type="submitProximo" value="Próximo"></input></a>
                </form>
            </section>
    );
}

export default CadastroIdentificacaoPage;