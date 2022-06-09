import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {
    FirePokemon charizard = new FirePokemon("Charizard",36, 140,"fireFood", "chaaaar");
    WaterPokemon blastoise = new WaterPokemon("Blastoise",34,170,"waterFood","roaaaar");
    WaterPokemon gyarados = new WaterPokemon("Gary",25,85,"waterFood","ruuuuuuhhhh");
    GrassPokemon venusaur = new GrassPokemon("Plant", 32, 120,"grassFood", "MUHHHHHH");
    GrassPokemon ditto = new GrassPokemon("Ditto", 10, 89, "grassFood", "DIT DIT DIT YO");
    ElectricPokemon raichu = new ElectricPokemon("Raichu", 39, 150, "electricFood", "CHUUUUU");
    private String name;
    private String village;

    public PokemonTrainer(String name) {
        this.name = name;

    }

    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }
    List<Pokemon> pokemons = Arrays.asList(charizard, venusaur, ditto, raichu, blastoise, gyarados);


    public FirePokemon getCharizard() {
        return charizard;
    }

    public void setCharizard(FirePokemon charizard) {
        this.charizard = charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public void setBlastoise(WaterPokemon blastoise) {
        this.blastoise = blastoise;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }

    public void setGyarados(WaterPokemon gyarados) {
        this.gyarados = gyarados;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public void setVenusaur(GrassPokemon venusaur) {
        this.venusaur = venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public void setDitto(GrassPokemon ditto) {
        this.ditto = ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public void setRaichu(ElectricPokemon raichu) {
        this.raichu = raichu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
