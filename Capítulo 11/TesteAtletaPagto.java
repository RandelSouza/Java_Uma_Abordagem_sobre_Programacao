import javax.swing.JOptionPane;

public class TesteAtletaPagto{
    public static void main(String[] args) {
        Exercicio1 atleta = new Exercicio1();
        atleta.inserirDados();
        atleta.mostrar();
        atleta.atualizarValor(Double.parseDouble(JOptionPane.showInputDialog("Digite a percentagem de aumento: ")));
        atleta.mostrar();
    }
}
