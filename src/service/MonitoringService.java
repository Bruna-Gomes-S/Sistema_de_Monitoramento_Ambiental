package service;
import model.EnvironmentData;

public class MonitoringService {
    public void processData(EnvironmentData data) {
        System.out.println("--- Status do Monitoramento ---");
        
        System.out.printf("Temperatura: %.2f C | Umidade: %d | Luz: %d\n", 
                          data.temperatura, data.umidade, data.nivelLuz);

        if (data.temperatura < 10.0) {
            System.out.println("[ALERTA] Temperatura baixa no ambiente!");
        } 
        else if (data.temperatura > 40.0) {
            System.out.println("[ALERTA] Temperatura alta no ambiente!");
        }
        if (data.nivelLuz < 200) {
            System.out.println("[AVISO] Luminosidade baixa detectada.");
        } 
        else if (data.nivelLuz > 800) {
            System.out.println("[AVISO] Luminosidade alta detectada.");
        }
        if (data.umidade < 300) { 
            System.out.println("[ALERTA] Umidade muito baixa! Solo seco detectado.");
        } 
        else if (data.umidade > 800) {
            System.out.println("[ALERTA] Umidade excessiva! Risco de transbordamento.");
        }

        System.out.println("-------------------------------");
    }
}