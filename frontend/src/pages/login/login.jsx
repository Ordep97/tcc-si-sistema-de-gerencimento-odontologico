import React from "react";
import "./login-style.css";
// import {ReactComponent as background} from '../../assets/login/background-Login.png';


  const LoginPage = () => {
    return(
        <div className="container-login">
            <form className="form-login">
                <h1>LOGIN</h1>
                <label for="email">E-mail</label> 
                <input type="email" name="email" id="email" placeholder="Digite seu e-mail" autocomplete="off"/>
                <label for="password">Senha</label>
                <input type="password" name="password" id="password" placeholder="Digite a sua senha"/>
                <a href="/user-page"><input type="submitEntrar" value="Entrar"/> </a>
                {/* <input type="submitEntrar" value="Entrar"/> */}
            </form>
        </div>    
    );
}

export default LoginPage;