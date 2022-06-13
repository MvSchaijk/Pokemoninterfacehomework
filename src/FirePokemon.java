import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
    private final static String TYPE = "fire";

    List<String> attacks = Arrays.asList("fireLash","flameThrower","pyroBall","inferno");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }
    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(getName() +", doe je fire lash!");
    }
    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(getName() +", doe je flame thrower!");
    }
    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(getName() +", doe je pyro ball!");
    }
    void inferno(Pokemon name, Pokemon enemy){
        System.out.println(getName() +", doe je inferno!");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
