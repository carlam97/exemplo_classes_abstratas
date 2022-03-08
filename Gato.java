public class Gato extends Mamifero{
    
    private String raca;

    public String getRaca(){
        return raca;
    } public void setRaca(String raca){
        this.raca=raca;
    }

    @Override
    public String amamentar(){
        return "Toma Leite";
    }
    @Override
    public String emitirSom(){
        return "Sim";
    }
}
