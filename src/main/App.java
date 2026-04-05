package main;
import model.EnvironmentData;
import service.MonitoringService;

public class App {
    public static void main(String[] args) throws InterruptedException {
        MonitoringService service = new MonitoringService();
        
        System.out.println("Iniciando Sistema de Monitoramento...");

        while (true) {
            
        	double tempSimulada = 15.0 + (Math.random() * 20); 
        	int umidSimulada = (int)(Math.random() * 1024); 
        	int luzSimulada = (int)(Math.random() * 1024);

            EnvironmentData leituraAtual = new EnvironmentData(tempSimulada, umidSimulada, luzSimulada);
            
            service.processData(leituraAtual);

            Thread.sleep(3000); 

        }
}
}