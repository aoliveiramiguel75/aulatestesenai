import Chart from 'react-apexcharts'

const GraficoDeRosca = () => {
    const mockData = {
        series: [1.274, 1.326, 1.700, 0.568, 2.623, 0.457],
        labels: ['Antonio', 'Francisco', 'João', 'Maria', 'Neide', 'Oliver']
    }
    
    const options = {
        legend: {
            show: true
        }
    }

    return(
        <Chart 
            options={{ ...options, labels: mockData.labels}}
            series={mockData.series}
            type="donut"
            height="240"

        
        />
);


}

export default GraficoDeRosca;