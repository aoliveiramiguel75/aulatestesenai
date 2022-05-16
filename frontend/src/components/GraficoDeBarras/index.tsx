import Chart from 'react-apexcharts'

const GraficoDeBarras = () => {
    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };
    
    const mockData = {
        labels: {
            categories: ['Antonio', 'Francisco', 'João', 'Maria', 'Neide', 'Oliver']
        },
        series: [
            {
                name: "Valor médio de vendas:  R$",
                data: [104.00, 109.59, 104.30, 94.66, 109.33, 149.32]                   
            }
        ]
    };

    return(
        <Chart 
            options={{ ...options, xaxis: mockData.labels}}
            series={mockData.series}
            type="bar"
            height="240"

        
        />
);


}

export default GraficoDeBarras;
