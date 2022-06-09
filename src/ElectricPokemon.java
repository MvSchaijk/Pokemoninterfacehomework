import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{
    private final static String TYPE = "electric";
    List<String> attacks = Arrays.asList("electroBall","voltTackle","thunder","thunderPunch");


    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }
    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(", doe je electroball!");
    }
    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(", doe je volt tackle!");
    }
    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(", doe je thunder aanval!");
    }
    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(", doe je thunder punch!");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
