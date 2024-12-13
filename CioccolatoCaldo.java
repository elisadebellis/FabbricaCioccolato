public class CioccolatoCaldo extends Cioccolato{

    
    private float temperatura;
    private float densita;

    private int peso;

    


    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void setDensita(float densita) {
        this.densita = densita;
    }

    public void setPeso(int peso) {
        if (peso>20){
            this.peso = peso;
        }
        else {
            System.out.println("Peso minimo impostato a 20");
            this.peso = 20;
        }
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getDensita() {
        return densita;
    }

    public int getPeso() {
        return peso;
    }

    

    @Override
    public String toString() {
        return "CioccolatoCaldo [temperatura=" + temperatura + ", tipoCioccolato=" + tipoCioccolato + ", densita="
                + densita + ", aggiunta=" + aggiunta + ", peso=" + peso + "]";
    }

    public CioccolatoCaldo(String tipoCioccolato, String aggiunta, double percentualeCacao, float temperatura, float densita, int peso){

        super(tipoCioccolato, aggiunta,percentualeCacao);
        this.temperatura = temperatura;
        this.densita = densita;

    }

    @Override
    public void produce(){
     
        if (peso > super.MAX_PROD){

            System.out.println("Peso non sufficiente");


        }
        else {
            super.produce();
            super.MAX_PROD -= peso;
        }
    }


}
