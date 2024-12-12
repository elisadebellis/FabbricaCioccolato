public class Cioccolato {
    protected static  int MAX_PROD = 100;
    protected String tipoCioccolato;
    protected String aggiunta;
    protected double percentualeCacao;

    public void produce(){
        System.out.println("tipo cioccolato: "+ tipoCioccolato+ " cacao: " + percentualeCacao+ "%"); 
    }

    public String getTipoCioccolato() {
        return tipoCioccolato;
    }

    public void setTipoCioccolato(String tipoCioccolato) {
        this.tipoCioccolato = tipoCioccolato;
    }

    public String getAggiunta() {
        return aggiunta;
    }

    public void setAggiunta(String aggiunta) {
        this.aggiunta = aggiunta;
    }

    public Cioccolato(String tipoCioccolato, String aggiunta) {
        this.tipoCioccolato = tipoCioccolato;
        this.aggiunta = aggiunta;
    }

    public double getPercentualeCacao() {
        return percentualeCacao;
    }

    public void setPercentualeCacao(double percentualeCacao) {
        this.percentualeCacao = percentualeCacao;
    }

    

}


