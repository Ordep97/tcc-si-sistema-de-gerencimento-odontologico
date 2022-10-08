import React from "react";
import 'login-style.css';
import {ReactComponent as background} from '../../assets/login/background-Login.png';
import {
    container,
    inputLabel,
    Button,
    TextField
  } from "@material-ui/core";

  function Form() {
    const [name, setName] = useState('');
    const [last_name, setLastName] = useState('');
    const [cpf, setCpf] = useState('');
    const [news, setNews] = useState(true);
    const [promotions, setPromotions] = useState(true);
  
    const [CPFError, setCPFError] = useState(false);

    return (
        <Container maxWidth="sm" component="article" className="form">
            <h1>LOGIN</h1>
            <form onSubmit={(event) => {
            event.preventDefault();
      }}>
        <InputLabel>Email</InputLabel>

                <Button className="btn-form" variant="contained" color="primary">
                    Cadastrar
                </Button>
            </form>

        </Container>

    );
}

export default LoginPage;