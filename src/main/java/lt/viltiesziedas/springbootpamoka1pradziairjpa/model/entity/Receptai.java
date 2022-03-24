package lt.viltiesziedas.springbootpamoka1pradziairjpa.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class Receptai
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pavadinimas;
    private String nurodymai;
    private int kalorijosPer100g;
    private double kaina;

    @ManyToMany
    @JoinTable (
            name = "sujungimas_receptai_ingredientai",
            joinColumns = @JoinColumn(name = "recepto_id"),
            inverseJoinColumns = @JoinColumn(name = "ingrediento_id"))
    private Set<Ingredientas> receptoIngredientai;


    public Receptai(long id, String pavadinimas, String nurodymai, int kalorijosPer100g, double kaina, Set<Ingredientas> receptoIngredientai)
    {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.nurodymai = nurodymai;
        this.kalorijosPer100g = kalorijosPer100g;
        this.kaina = kaina;
        this.receptoIngredientai = receptoIngredientai;
    }

    public Receptai()
    {
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getPavadinimas()
    {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas)
    {
        this.pavadinimas = pavadinimas;
    }

    public String getNurodymai()
    {
        return nurodymai;
    }

    public void setNurodymai(String nurodymai)
    {
        this.nurodymai = nurodymai;
    }

    public int getKalorijosPer100g()
    {
        return kalorijosPer100g;
    }

    public void setKalorijosPer100g(int kalorijosPer100g)
    {
        this.kalorijosPer100g = kalorijosPer100g;
    }

    public double getKaina()
    {
        return kaina;
    }

    public void setKaina(double kaina)
    {
        this.kaina = kaina;
    }

    public Set<Ingredientas> getReceptoIngredientai()
    {
        return receptoIngredientai;
    }

    public void setReceptoIngredientai(Set<Ingredientas> receptoIngredientai)
    {
        this.receptoIngredientai = receptoIngredientai;
    }

    @Override
    public String toString()
    {
        return "Receptai{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", nurodymai='" + nurodymai + '\'' +
                ", kalorijosPer100g=" + kalorijosPer100g +
                ", kaina=" + kaina +
                ", receptoIngredientai=" + receptoIngredientai +
                '}';
    }
}
