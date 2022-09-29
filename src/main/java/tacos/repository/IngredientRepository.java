package tacos.repository;

import org.springframework.data.repository.CrudRepository;
import tacos.model.goods.Ingredient;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {
}
