public class Principal {
    public static void main(String [] args) {

        Papagaio p=new Papagaio();
        Cachorro c=new Cachorro();
        Gato g=new Gato();

        c.setRaca("Vira Lata");
        c.setTamanho("67cm");

        g.setRaca("Persa");

        p.setNome("Loro");
        System.out.println(p.getNome());
        System.out.println(p.voar());
        System.out.println(p.emitirSom());

        c.setNome("Bob");
        System.out.println(c.getNome());
        System.out.println(c.amamentar());
        System.out.println(c.emitirSom());
        System.out.println(c.getRaca());
        System.out.println(c.getTamanho());
        
        g.setNome("Garfiled");
        System.out.println(g.getNome());
        System.out.println(g.amamentar());
        System.out.println(g.emitirSom());
        System.out.println(g.getRaca());

        
    }
    
}
