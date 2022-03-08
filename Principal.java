public class Principal {
    public static void main(String [] args) {

        Papagaio p=new Papagaio();
        Aguia a=new Aguia();

        p.setNome("Loro");
        System.out.println(p.voar());
        System.out.println(p.nadar());

        a.setNome("Corinthians");
        System.out.println(a.voar());
        System.out.println(a.nadar());

        
    }
    
}
