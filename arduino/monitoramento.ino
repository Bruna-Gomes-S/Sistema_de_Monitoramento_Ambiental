const int pinoTemp = A1;    
const int pinoLuz = A2;     
const int pinoUmidade = A3; 

void setup() {
  Serial.begin(9600); 
}

void loop() {
  int leituraTemp = analogRead(pinoTemp);
  float voltagem = leituraTemp * 5.0 / 1023.0;
  float temperaturaC = (voltagem - 0.5) * 100.0;

  int luz = analogRead(pinoLuz);

  int umidade = analogRead(pinoUmidade);
  Serial.print("Temp: ");
  Serial.print(temperaturaC);
  Serial.print(" C | Luz: ");
  Serial.print(luz);
  Serial.print(" | Umidade: ");
  Serial.println(umidade);

  delay(2000); 
}
