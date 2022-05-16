import Footer from "components/Footer";
import GraficoDeBarras from "components/GraficoDeBarras";
import GraficoDeRosca from "components/GraficoDeRosca";
import NavBar from "components/NavBar";
import TabelaDedados from "components/TabelaDeDados";



function App() {
  return (
    <>
      <NavBar />

      <div className="container">
        <h1 className="text-primary py-3"> Dashboard de Vendas</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary"> Ticket médio </h5>
            <GraficoDeBarras />
          </div>

          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Valores distribuidos da Comissão </h5>
            <GraficoDeRosca />
          </div>          

        </div>

        <div className="py-3">
          <h2 className="text-primary"> Todas as Vendas (tabela)</h2>

        </div>

        <TabelaDedados />
      </div>

      <Footer />
    </>
  );
}

export default App;
