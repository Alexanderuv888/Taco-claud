package tacos.data;
import java.util.Optional;


import org.springframework.stereotype.Repository;
import tacos.Ingredient;
@Repository
public interface IngredientRepository{
    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}