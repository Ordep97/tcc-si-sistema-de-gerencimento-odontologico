import React from "react";
import "./login-style.css";
// import {ReactComponent as background} from '../../assets/login/background-Login.png';


  const LoginPage = () => {
    return(
        <div className="container">
            <div className="form">
                <h1>LOGIN</h1>
                <label for="email">E-mail</label> 
                <input type="email" name="email" id="email" placeholder="Digite seu e-mail" autocomplete="off"/>
                {/* placeholder é uma "dica" para orientar o usuário o que digitar */}
                <label for="password">Senha</label>
                <input type="password" name="password" id="password" placeholder="Digite a sua senha"/>
                <input type="submit" value="Entrar"/>            
            </div>
        </div>    
    );
}

export default LoginPage;