import React from "react";
import "./cadastro-localizacao-style.css";

const CadastroLocalizacaoPage = () => {
    return (
        <div class="format-localizacao">   
            
            <section class="container-localizacao">

                <h1>CADASTRO DE PACIENTE</h1>

                <form class="form-localizacao">

                    <h2>DADOS DE LOCALIZAÇÃO</h2>

                    <label for="Logradouro">Logradouro:</label>
                    <input type="text" placeholder="Avenida/Estrada/Rua" />

                    <label for="Numero">Numero:</label>
                    <input type="number" />

                    <label for="Complemente">Complemento:</label>
                    <input type="text" />

                    <label for="Referencia">Referencia:</label>
                    <input type="text" />

                    <label for="Bairro">Bairro:</label>
                    <input type="text" />

                    <label for="CEP">CEP:</label>
                    <input type="number" />

                    <label for="Municipio">Município:</label>
                    <input type="text" />

                    <label>Estado:</label>
                    <select id="Estado">
                        <option value="Acre">AC</option>
                        <option value="Alagoas">AL</option>
                        <option value="Amapa">AP</option>
                        <option value="Amazonas">AM</option>
                        <option value="Bahia">BA</option>
                        <option value="Ceara">CE</option>
                        <option value="Espirito Santo">ES</option>
                        <option value="Goias">GO</option>
                        <option value="Maranhao">MA</option>
                        <option value="Mato Grosso">MT</option>
                        <option value="Mato Grosso do Sul">MS</option>
                        <option value="Minas Gerais">MG</option>
                        <option value="Para">PA</option>
                        <option value="Paraiba">PB</option> 
                        <option value="Parana">PR</option>
                        <option value="Pernambuco">PE</option>
                        <option value="Piaui">PI</option>
                        <option value="Rio de Janeiro">RJ</option>
                        <option value="Rio Grande do Norte">RN</option>
                        <option value="Rio Grande do Sul">RS</option>
                        <option value="Rondonia">RO</option>
                        <option value="Roraima">RR</option>
                        <option value="Santa Catarina">SC</option>
                        <option value="São Paulo">SP</option>
                        <option value="Sergipe">SE</option>
                        <option value="Tocantins">TO</option>
                        <option value="Distrito Federal">DF</option>
                    </select>

                    <label>País:</label>
                    <select id="Pais">
                        <option value="Brasil">Brasil</option>
                        <option value="Estados Unidos">Estados Unidos</option>
                        <option value="Franca">França</option>
                        <option value="Alemanha">Alemanha</option>
                        <option value="Mexico">Mexico</option>
                        <option value="Espanha">Espanha</option>
                    </select>

                    {/* <input type="submitCadastrarDependente" value="Cadastrar dependente" /> */}
                    <a href="/cadastro-identificacao"><input type="submitFinalizarCadastro" value="Voltar" /></a>
                    <input type="submitFinalizarCadastro" value="Finalizar Cadastro" />
                </form>
            </section>
        </div>
    );
}

export default CadastroLocalizacaoPage;