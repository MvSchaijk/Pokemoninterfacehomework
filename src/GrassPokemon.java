import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private final static String TYPE = "grass";

    List<String> attacks = Arrays.asList("leafStorm", "leechSeed","leaveBlade","solarBeam");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }
    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(". doe je leaf storm!");
    }
    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(", doe je leech seed!");
    }
    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(", doe je leaf blade!");
    }
    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(", doe je solar beam!");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
