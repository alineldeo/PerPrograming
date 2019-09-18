package Model;

public class Automovel {

    private String placa;
    private int chassi;
    private String cor;
    private int portas;

    public Automovel() {
    }

    public Automovel(String placa, int chassi, String cor, int portas) {
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.portas = portas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

}
