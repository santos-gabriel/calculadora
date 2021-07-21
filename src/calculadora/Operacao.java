package calculadora;

public class Operacao {

    private double valor1;
    private double valor2;
    private String tipoOperacao;
    
    public double getValor1() {
        return valor1;
    }
    
    public void setValor1(double parametro) {
        valor1 = parametro;
    }
    
    public double getValor2() {
        return valor2;
    }
    
    public void setValor2(double parametro) {
        valor2 = parametro;
    }
    
    public String getTipoOperacao() {
        return tipoOperacao;
    }
    
    public void setTipoOperacao(String parametro) {
        tipoOperacao = parametro;
    }
    
    public double soma(double parametro1, double parametro2) {
        return parametro1 + parametro2;
    }
    
    public double divisao(double parametro1, double parametro2) {
        return parametro1 / parametro2;
    }
    
    public double multiplicacao(double parametro1, double parametro2) {
        return parametro1 * parametro2;
    }
    
    public double subtracao(double parametro1, double parametro2) {
        return parametro1 - parametro2;
    }
    
    public double calculaValor() {
        if (tipoOperacao.equals("+")) {            
            return soma(valor1, valor2);
            
        } else if (tipoOperacao.equals("-")) {
            return subtracao(valor1, valor2);
            
        } else if (tipoOperacao.equals("*")) {
            return multiplicacao(valor1, valor2);
            
        } else if (tipoOperacao.equals("/")) {
            return divisao(valor1, valor2);
            
        } else {
            return 0;
        }
    }
    
}
