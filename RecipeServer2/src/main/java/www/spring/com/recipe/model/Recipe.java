package www.spring.com.recipe.model;

import java.util.List;

/**
 * 레시피를 가르키는 클래스 입니다. Composite에 해당합니다.
 * 
 * @author user
 *
 */
public class Recipe extends RecipeIngredients {

	private int recipeId;
	private int views;
	// 좋아요 수
	private int goodAamount;
	// 싫어요 수
	private int badAamount;
	
	private List<RecipeIngredients> ingredientsList;
	
	public Recipe() {
	}

	public void addingredients(Ingredients ingredients) {
		ingredientsList.add(ingredients);
	}

	public List<RecipeIngredients> getIngredientsList() {
		return ingredientsList;
	}

	public void setIngredientsList(List<RecipeIngredients> ingredientsList) {
		this.ingredientsList = ingredientsList;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getGoodAamount() {
		return goodAamount;
	}

	public void setGoodAamount(int goodAamount) {
		this.goodAamount = goodAamount;
	}

	public int getBadAamount() {
		return badAamount;
	}

	public void setBadAamount(int badAamount) {
		this.badAamount = badAamount;
	}

	//부모 클레스의 함수에 넣어 줄 수 있다.
	public int getRecipeIngredientsId() {
		return super.getRecipeIngredientsId();
	}
	public void setRecipeIngredientsId(int recipeIngredientsId) {
		super.setRecipeIngredientsId(recipeIngredientsId);
	}
	public String getName() {
		return super.getName();
	}
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public String toString() {
		return "Recipe [recipeId=" + recipeId + ", views=" + views + ", goodAamount=" + goodAamount + ", badAamount="
				+ badAamount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + badAamount;
		result = prime * result + goodAamount;
		result = prime * result + recipeId;
		result = prime * result + views;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		if (badAamount != other.badAamount)
			return false;
		if (goodAamount != other.goodAamount)
			return false;
		if (recipeId != other.recipeId)
			return false;
		if (views != other.views)
			return false;
		return true;
	}

	
	
}
