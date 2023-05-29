package br.fatecrl.mvcdemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.fatecrl.mvcdemo.enums.PokemonType;
import br.fatecrl.mvcdemo.models.Pokemon;

@Controller
@RequestMapping("/pokemons")
public class PokedexController {

    private static final List<Pokemon> pokemons = new ArrayList<Pokemon>();

    public PokedexController() {
        pokemons.add(new Pokemon("0001", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/001.png",
                "Bulbassauro", PokemonType.GRASS, PokemonType.POISON));
        pokemons.add(new Pokemon("0004", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/004.png",
                "Charmander", PokemonType.FIRE, PokemonType.NONE));
        pokemons.add(new Pokemon("0007", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/007.png",
                "Squirtle", PokemonType.WATER, PokemonType.NONE));
    }

    @GetMapping
    public String getAlunos(Model model) {
        model.addAttribute("pokemons", pokemons);

        return "pokemonsView";
    }

}
