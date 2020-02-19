import javax.swing.JOptionPane;

public class Principal2{
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta();
        Time time1  = new Time();

        time1.setCodigoTime(55);
        time1.setNomeTime("Time y");
        time1.setAtleta(atleta1);
        time1.getAtleta().inserirDados();

        System.out.println("O Time é: " + time1.getNomeTime());
        System.out.println("O nome do Atleta é: " + time1.getAtleta().getNome());
        System.out.println("Repito o nome do Atleta é: " + atleta1.getNome());
    }
}
