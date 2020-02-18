public class Corredor extends Atleta{
    private double velocidadeMedia;

    public void setVelocidadeMedia(double velocidadeMedia){
        this.velocidadeMedia = velocidadeMedia;
    }

    public double getVelocidadeMedia(){
        return this.velocidadeMedia;
    }

    public double atualizarValor(double taxa){
        return super.atualizarValor(2*taxa);
    }
}
