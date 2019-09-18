package Model;

public abstract class AluguelDeAutomovel {

    protected Double valor;
    protected String modelo;
    protected String dataSaida;
    protected String dataEntrada;

    public AluguelDeAutomovel() {
    }

    public AluguelDeAutomovel(Double valor, String modelo, String dataSaida, String dataEntrada) {
        this.valor = valor;
        this.modelo = modelo;
        this.dataSaida = dataSaida;
        this.dataEntrada = dataEntrada;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

}
