package www.spring.com.recipe.mapper;

import java.util.List;

import www.spring.com.recipe.model.CookingProcess;
import www.spring.com.recipe.model.Recipe;
import www.spring.com.recipe.model.TipRecipe;
import www.spring.com.recipe.model.TipRecipeCookingPreocess;

/**
 * 어플에서 온 요청과 알맞은 값을 반환시켜줄 Mapper입니다.
 * @author user
 *
 */
public interface RecipeMapper {
	public List<Recipe> selectAllRecipe();
	public List<CookingProcess> selectAllCP();
	public List<CookingProcess> selectCP(int recipeId);
	//<!-- S.11.30 -->
	public List<TipRecipe> selectAllTipRecipe();
	public List<TipRecipeCookingPreocess> selectAllTipRecipeCP();
	//<!-- E.11.30 -->
}
