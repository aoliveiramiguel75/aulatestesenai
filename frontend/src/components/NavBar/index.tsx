import senailogo from 'assets/img/senailogo.png';


function NavBar() {
    return (
        /* Função da barar de navegação */
        <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
            <div className="container">
                <nav className="my-2 my-md-0 mr-md-3">
                    <img src={senailogo} alt="Logo do senai" width="150" />
                </nav>
            </div>
        </div>
    );
}

export default NavBar;
