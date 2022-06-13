import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{
    private final static String TYPE = "water";

    List<String> attacks = Arrays.asList("surf","hydroCanon","rainDance","hydroPump");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }
    void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with surf!");
        int temp= 0;
        switch (enemy.getType()){
            case "water":
               temp = enemy.getHp() - 10;
               enemy.setHp(temp);
                System.out.println("it's not very effective, " + enemy.getName() + " loses 10 hp");
               case "grass":
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                   System.out.println(enemy.getName() + " loses 20 hp");

            case "fire":
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println("it's super effective, " + enemy.getName() + " loses 10 hp");

            case "electric":
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health remaining!");
    }
    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Hydro Cannon!");
    }
    void rainDance(Pokemon name, Pokemon enemy){

    }
    void hydroPump(Pokemon name, Pokemon enemy){}

    public List<String> getAttacks() {
        return attacks;
    }
}
