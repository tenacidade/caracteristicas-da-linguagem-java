package one.digitalinnovation.finals;

public class Programa {

    public static void main(String[] args) {
        final HardcoreGamer hardcoreGamer = new HardcoreGamer();

        final Gamer gamer = new Gamer();

        final CasualGamer casualGamer = new CasualGamer();

        final var game = "PUBG";

        //game = "WoW"; //como é final, se eu tentar mudar o valor, não vou conseguir.

        System.out.println(casualGamer.play(game));


    }

}
