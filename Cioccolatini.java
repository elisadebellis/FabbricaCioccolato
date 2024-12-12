public class Cioccolatini extends Cioccolato{
    private String forma;
    private String ripieno;
    private final int peso = 2;

    public Cioccolatini(String tipoCioccolato, String aggiunta, String forma, String ripieno){
        super(tipoCioccolato, aggiunta);
        this.forma=forma;
        this.ripieno=ripieno;

    }

    @Override
    public void produce(){
        if(peso < super.MAX_PROD){
            super.MAX_PROD -= peso;
            super.produce();
        }
        else{
            System.out.println("Cioccolato non sufficiente");
        }

    }

    public String getForma() {
        return forma;
    }

    public String getRipieno() {
        return ripieno;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setRipieno(String ripieno) {
        this.ripieno = ripieno;
    }

    
}
