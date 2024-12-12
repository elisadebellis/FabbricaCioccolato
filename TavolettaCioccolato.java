public class TavolettaCioccolato extends Cioccolato {

    private int peso;
    private boolean contieneNocciole;

    public void setPeso(int peso){
        if(peso>=4 && peso<=24){
            this.peso = peso;
        }
        else if(peso < 4){
            System.out.println("Peso impostato al minimo di produzione: 4");
            this.peso=4;
        }
        else{
            System.out.println("Peso impostato al minimo di produzione: 4");
            this.peso=24;
        }
    }

    public TavolettaCioccolato(String tipoCioccolato, String aggiunta, int peso, boolean contieneNocciole){
        super(tipoCioccolato, aggiunta);
        setPeso(peso);
        this.contieneNocciole=contieneNocciole;
    }

    @Override
    public void produce() {
        // TODO Auto-generated method stub 
        if(peso < super.MAX_PROD){
            super.MAX_PROD -= peso;
            super.produce();
        }
        else{
            System.out.println("Cioccolato non sufficiente");
        }

    }
}
