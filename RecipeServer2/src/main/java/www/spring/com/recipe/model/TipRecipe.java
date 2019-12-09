//-- E.11.30 --

package www.spring.com.recipe.model;

public class TipRecipe {
		
	private int tipRecipeId;
	private String addRecipeIngredients;
	
	public TipRecipe() {
	}
	
	public int getTipRecipeId() {
		return tipRecipeId;
	}
	public void setTipRecipeId(int tipRecipeId) {
		this.tipRecipeId = tipRecipeId;
	}
	public String getAddRecipeIngredients() {
		return addRecipeIngredients;
	}
	public void setAddRecipeIngredients(String addRecipeIngredients) {
		this.addRecipeIngredients = addRecipeIngredients;
	}


	@Override
	public String toString() {
		return "TipRecipe [tipRecipeId=" + tipRecipeId + ", addRecipeIngredients="
				+ addRecipeIngredients + "]";
	}
	
}
//-- E.11.30 --