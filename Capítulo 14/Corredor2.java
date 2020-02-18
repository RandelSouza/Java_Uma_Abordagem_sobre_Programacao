public class Corredor2 extends Atleta{
    private double velocidadeMedia;

    public void setVelocidadeMedia(double velocidadeMedia){
        this.velocidadeMedia = velocidadeMedia;
    }

    public double getVelocidadeMedia(){
        return this.velocidadeMedia;
    }

    public double atualizarValor(double taxa){
        double valorPatrocinio = this.getValorPatrocinio();
        taxa = 2 * taxa;
        valorPatrocinio = valorPatrocinio + valorPatrocinio * taxa/100;
        this.setValorPatrocinio(valorPatrocinio);
        return this.getValorPatrocinio();
    }
}
