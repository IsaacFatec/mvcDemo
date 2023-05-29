package br.fatecrl.mvcdemo.models;

import br.fatecrl.mvcdemo.enums.PokemonType;

public class Pokemon {
    private String ndex;
    private String image;
    private String name;
    private PokemonType type1;
    private PokemonType type2;

    public String getNdex() {
        return ndex;
    }
    
    public void setNdex(String ndex) {
        this.ndex = ndex;
    }

    public String getImage() {
        return image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public PokemonType getType1() {
        return type1;
    }
    
    public void setType1(PokemonType type1) {
        this.type1 = type1;
    }
    
    public PokemonType getType2() {
        return type2;
    }
    
    public void setType2(PokemonType type2) {
        this.type2 = type2;
    }
    

    public Pokemon(String ndex, String image, String name, PokemonType type1, PokemonType type2) {
        this.ndex = ndex;
        this.image = image;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
    }
}
