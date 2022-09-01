package tacos.data;
import java.util.Optional;


import org.springframework.stereotype.Repository;
import tacos.Ingredient;

public interface IngredientRepository{
    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}