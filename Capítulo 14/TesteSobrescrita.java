import javax.swing.JOptionPane;

public class TesteSobrescrita{
    public static void main(String[] args) {
        Atleta atleta = new Atleta();
        Corredor corredor = new Corredor();

        atleta.setValorPatrocinio(1000);
        corredor.setValorPatrocinio(1000);

        int percentual = 15;

        // O mesmo percentual de aumento na chamada dos dois objetos

        atleta.atualizarValor(percentual);
        corredor.atualizarValor(percentual);

        // Porém com resultados diferentes

        System.out.println("Novo salário de Atleta: " + atleta.getValorPatrocinio());
        System.out.println("Novo salário de Corredor: " + corredor.getValorPatrocinio());
    }
}
