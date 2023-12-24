
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        System.out.println("Exercícios IFRN");
        System.out.println("***Calculo Dias***");
        int tempo = CalculoAnos.calculoDias();
        System.out.println("O tempo em dias é: " + tempo);
        System.out.println();


        System.out.println("***Calculo Médias***");
        double media1 = CalculoMedias.calculoMedia1();
        System.out.println("A primeira média é: " + media1);
        double media2 = CalculoMedias.calculoMedia2();
        System.out.println("A segunda média é: " + media2);
        double soma = media1 + media2;
        double mediasoma = soma/2;
        System.out.println("A soma das médias é: " + soma + " E a média das médias é: " + mediasoma);
        System.out.println();

        System.out.println("***Calculo Reajuste***");
        double valor_reajustado = CalculoReajuste.calculoReajuste();
        System.out.println("O valor com reajuste de 1% é: " + valor_reajustado);
        System.out.println();

        System.out.println("***Calculo IPI dos produtos***");
        double valor_IPI = CalculoIPI.calculoIPI();
        System.out.println("O valor total a ser pago pelos produtos é: " + valor_IPI);
        System.out.println();

        System.out.println("***Calculo Salário Mínimo***");
        double relacao = CalculoSalario.calculoRelacao();
        System.out.printf("Esse usuário recebe: %.2f salários mínimos", (relacao));
        System.out.println();

        AntecessorSucessor.antecessorSucessor();
        System.out.println("***Fim dos exercícios***");
    }

}