package www.spring.com.recipe.model;

/**
 * Recipe와 Ingredients의 Component입니다.
 * @author user
 *
 */
public abstract class RecipeIngredients {
	private int recipeIngredientsId;
	private String name;
	
	
	
	public RecipeIngredients() {
	}
	
	public int getRecipeIngredientsId() {
		return this.recipeIngredientsId;
	}
	public void setRecipeIngredientsId(int recipeIngredientsId) {
		this.recipeIngredientsId = recipeIngredientsId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
