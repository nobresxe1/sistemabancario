package fiap.banco;

public class contacorrente extends conta {
// perguntar para o nidio por que ta dando erro
    public contacorrente() {
        super(agencia, numero, saldo);
    }
    private String tipo;
    private double chequeEspecial;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    public double getSaldoDisponivel() {
        return super.getSaldo() + chequeEspecial;
    }
}