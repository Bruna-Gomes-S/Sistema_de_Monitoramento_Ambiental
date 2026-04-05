# 🌿 Sistema de Monitoramento Ambiental Integrado (IoT)

Este projeto integra hardware (Arduino), software de processamento (Java) e design de experiência do usuário (Figma) para criar uma solução completa de monitoramento de umidade, temperatura e luminosidade.

## 🚀 Tecnologias Utilizadas

* **Hardware:** Arduino UNO
* **Firmware:** Linguagem C++ (IDE Arduino)
* **Backend:** Java (Programação Orientada a Objetos)
* **Versionamento:** Git & GitHub
* **Design/UX:** Figma (Prototipagem de alta fidelidade)
* **IDE Principal:** Eclipse

* ## 🛠️ Arquitetura do Sistema
O projeto foi dividido em três camadas principais para garantir a modularidade e a escalabilidade do sistema.

### 1. Camada de Hardware & Firmware (Arduino / C++)
A captura de dados é realizada por uma malha de sensores conectada a um **Arduino UNO**. 

* **Sensores Utilizados:** * `TMP36`: Captura a temperatura analógica, convertida via software para Celsius.
    * `LDR`: Mede a incidência de luz no ambiente.
    * `Higrômetro`: Monitora a umidade do solo (pino A3).
* **Lógica em C++:** O firmware foi desenvolvido para realizar leituras síncronas a cada 2000ms. Os dados são concatenados em uma `String` e enviados via porta Serial (9600 bps) no formato: `Temp, Umidade, Luz`.

> **Como visualizar o código C++:** O arquivo de lógica do Arduino está localizado na pasta `/firmware` deste repositório.

* ### 2. Camada de Processamento (Java & POO)
Utilizando a IDE Eclipse, foi desenvolvido um backend em **Java** focado em Programação Orientada a Objetos.

* **Padronização de Dados:** A classe `EnvironmentData` atua como um DTO (*Data Transfer Object*), organizando as variáveis capturadas.
* **Serviço de Monitoramento:** A classe `MonitoringService` contém a inteligência do projeto. Ela processa as Strings recebidas e aplica regras de negócio (condicionais `if/else`) para identificar estados críticos:
    * **Alerta de Solo Seco:** Disparado quando a umidade é < 300.
    * **Alerta Térmico:** Disparado se a temperatura ultrapassar 40°C.
* **Versionamento:** O projeto utiliza **Git** para controle de versão, garantindo um histórico de desenvolvimento limpo e profissional.



### 3. Camada de Interface & UX (Figma)
O protótipo mobile foi desenhado para oferecer uma visão clara e imediata do ambiente para o usuário final.

* **Design de Alta Fidelidade:** 12 telas interativas projetadas no Figma.
* **Feedback Cromático:** O dashboard altera suas cores dinamicamente (quente/frio/seco) para que o usuário identifique o problema sem precisar ler os números.
* **Fluxo de Configuração:** Inclui telas de login, ajustes de parâmetros e histórico de monitoramento.



---
## 📸 Demonstração Visual

| Circuito Arduino | Dashboard (Figma) | Console Java (Alertas) |
| :---: | :---: | :---: |
|<img width="323" height="181" alt="image" src="https://github.com/user-attachments/assets/685c50d9-ca6a-4c44-ad97-e31036c264f1" /> |<img width="399" height="272" alt="image" src="https://github.com/user-attachments/assets/4e8b25ea-a9e7-461c-bc52-5f0df81ceb0d" />| <img width="345" height="268" alt="image" src="https://github.com/user-attachments/assets/7690f195-efd0-445f-ad7c-1e489b84f8bb" />

---

## 🚀 Como Executar o Projeto

1.  **Hardware:** Clone o repositório e carregue o arquivo `.ino` no seu Arduino.
2.  **Software:** Importe a pasta do projeto no Eclipse.
3.  **Conexão:** Certifique-se de que a porta COM do Arduino coincide com a configurada no Java para leitura Serial.
