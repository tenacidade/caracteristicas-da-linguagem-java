package one.digitalinnovation.statics;

public class Programa {

    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Bipede";

        //ao utilizar o atributo static dessa forma, altera o atributo zoologia para todos objetos

        final Cachorro viraLatas = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viraLatas.zoologia);

        Cachorro.late();
    }

}
