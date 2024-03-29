import NavBar from "components/NavBar";
import Footer from "components/Footer";
import { Link } from "react-router-dom";

function Home() {
    return (
        <>
            <NavBar />
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">DSVendas</h1>
                    <p className="lead">Análise o desempenho das suas vendas por diferentes perspectivas</p>
                    <hr />
                    <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>
                    <Link to="/dashboard" className="btn btn-primary btn-lg">
                        Acessar dashboad
                    </Link>
                </div>
            </div>
            <Footer />
        </>
    );
}

export default Home;
