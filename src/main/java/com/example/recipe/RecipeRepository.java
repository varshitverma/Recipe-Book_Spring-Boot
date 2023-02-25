// Write your code here
package com.example.recipe;

import com.example.recipe.Recipe;
import java.util.*;

public interface RecipeRepository {
    ArrayList<Recipe> getRecipes();

    Recipe addRecipe(Recipe recipe);
    Recipe getRecipeById(int recipeId);
    Recipe updateRecipe(int recipeId, Recipe recipe);
    void deleteRecipe(int recipeId);
}