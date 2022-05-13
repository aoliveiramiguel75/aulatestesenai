function TabelaDedados() {
    return (
        /* Função para estilo e apresdentação de dados na tabela*/
        <div className="table-responsive">
            <table className="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>Vendedor</th>
                        <th>Número de vendas</th>
                        <th>Valor total das vendas</th>
                        <th>Ticket médio </th>
                        <th>Comisão</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Antonio</td>
                        <td>245</td>
                        <td>R$ 25.482.00</td>
                        <td>5%</td>
                        <td>25</td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
}

export default TabelaDedados;
