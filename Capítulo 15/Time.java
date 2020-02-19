class Time {
    private int codigoTime;
    private String nomeTime;
    private Atleta atleta;

    public void setCodigoTime(int codigoTime){
        this.codigoTime = codigoTime;
    }

    public int getCodigoTime(){
        return this.codigoTime;
    }

    public void setNomeTime(String nomeTime){
        this.nomeTime = nomeTime;
    }

    public String getNomeTime(){
        return this.nomeTime;
    }

    public void setAtleta(Atleta atleta){
        this.atleta = atleta;
    }

    public Atleta getAtleta(){
        return this.atleta;
    }
}
