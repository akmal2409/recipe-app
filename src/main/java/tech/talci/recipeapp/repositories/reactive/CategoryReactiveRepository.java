package tech.talci.recipeapp.repositories.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import tech.talci.recipeapp.domain.Category;

public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String> {
}
