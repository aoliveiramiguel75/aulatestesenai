import Footer from "components/Footer";
import NavBar from "components/NavBar";
import TabelaDedados from "components/TabelaDeDados";



function App() {
  return (
    <>
      <NavBar />

      <div className="container">
        <TabelaDedados />
      </div>

      <Footer />
    </>
  );
}

export default App;
