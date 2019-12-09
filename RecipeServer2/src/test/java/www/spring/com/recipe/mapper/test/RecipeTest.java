package www.spring.com.recipe.mapper.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;
import www.spring.com.recipe.mapper.RecipeMapper;
import www.spring.com.recipe.model.CookingProcess;
import www.spring.com.recipe.model.Recipe;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class RecipeTest {

	@Autowired
	private RecipeMapper recipeMapper;

	//@Test
	public void testAllRecipeSelect() {

		try {
			List<Recipe> list = recipeMapper.selectAllRecipe();
			list.forEach(Recipe -> System.out.println(Recipe));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//@Test
	public void testAllCPSelect() {

		try {
			List<CookingProcess> listCP = recipeMapper.selectAllCP();
			for (CookingProcess CP : listCP) {
				System.out.println(CP);
				//log.info(CP);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCPSelect() {

		try {
			List<CookingProcess> listCP = recipeMapper.selectCP(1);
			for (CookingProcess CP : listCP) {
				System.out.println(CP);
				//log.info(CP);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
