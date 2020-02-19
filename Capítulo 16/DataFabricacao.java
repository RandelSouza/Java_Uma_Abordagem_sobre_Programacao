public class DataFabricacao{
    private int dia;
    private int mes;
    private int ano;

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getDia(){
        return this.dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getMes(){
        return this.mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return this.ano;
    }

    public String dataCompleta(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public DataFabricacao(){
    }

    public DataFabricacao(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}
