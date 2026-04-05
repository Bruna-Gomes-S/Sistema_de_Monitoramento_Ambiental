package model;

public class EnvironmentData {
    public double temperatura;
    public int umidade;
    public int nivelLuz;

    public EnvironmentData(double t, int u, int l) {
        this.temperatura = t;
        this.umidade = u;
        this.nivelLuz = l;
    }
}