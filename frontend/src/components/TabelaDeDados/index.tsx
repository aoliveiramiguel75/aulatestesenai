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
                        <td>R$ 25,482.00</td>
                        <td>R$ 104,00</td>
                        <td>R$ 1.274,00</td>
                    </tr>
                    <tr>
                        <td>Francisco</td>
                        <td>242</td>
                        <td>R$ 26,521.00</td>
                        <td>R$ 109,59</td>
                        <td>R$ 1.326,00</td>
                    </tr>
                    <tr>
                        <td>João</td>
                        <td>326</td>
                        <td>R$ 34.003.52</td>
                        <td>R$ 104.30</td>
                        <td>R$ 1.700,00</td>
                    </tr>
                    <tr>
                        <td>Maria</td>
                        <td>326</td>
                        <td>R$ 18.933,00</td>
                        <td>R$ 94.66</td>
                        <td>R$ 568,00</td>
                    </tr>
                    <tr>
                        <td>Neide</td>
                        <td>480</td>
                        <td>R$ 52.478,63</td>
                        <td>R$ 109.33</td>
                        <td>R$ 2.623,00</td>
                    </tr>
                    <tr>
                        <td>Oliver</td>
                        <td>102</td>
                        <td>R$ 15.230,98 </td>
                        <td>R$ 149.32</td>
                        <td>R$ 457,00</td>
                    </tr>
                    
                </tbody>
            </table>
        </div>
    );
}

export default TabelaDedados;
