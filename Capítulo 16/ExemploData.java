public class ExemploData{
    private int dia = 0;
    private int mes = 0;
    private int ano = 0;

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
        if(this.dia == 0){
            return this.mes + "/" + this.ano;
        }
        return this.dia + "/" +this.mes + "/" + this.ano;
    }

    public ExemploData(){

    }

    public ExemploData(int mes, int ano){
        this.mes = mes;
        this.ano = ano;
    }
}
