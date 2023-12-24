public class CalculoIPI {

    public static double calculoIPI(){
        double valor1 = 15.50;
        double valor2 = 42.70;
        int quant1 = 13;
        int quant2 = 7;
        // Valor já em porcentagem do IPI
        double IPI = 1.02;
        double valor_total = (valor1*quant1 + valor2*quant2)*IPI;
        return valor_total;
    }

}
