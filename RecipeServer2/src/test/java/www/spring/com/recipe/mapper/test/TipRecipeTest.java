//<!-- S.11.30 -->
package www.spring.com.recipe.mapper.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;
import www.spring.com.recipe.mapper.RecipeMapper;
import www.spring.com.recipe.mapper.ReplyMapper;
import www.spring.com.recipe.model.ReplyVO;
import www.spring.com.recipe.model.TipRecipe;
import www.spring.com.recipe.model.TipRecipeCookingPreocess;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TipRecipeTest {

	@Autowired
	private ReplyMapper replyMapper;
	
	@Autowired
	private RecipeMapper recipeMapper;

	@Test
	public void testselectAllReply() {

		try {
			List<ReplyVO> list = replyMapper.getReply();
			list.forEach(d -> System.out.println(d));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//@Test
	public void testInsertReply() {

		try {
			for(int i = 0; i < 10; i++) {
				ReplyVO replyVO = new ReplyVO(1, "필림 끊길때 까지는 말이야...", 1);
				replyMapper.insertReply(replyVO);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSelectAllTipRecipe() {

		try {
			List<TipRecipe> listCP = recipeMapper.selectAllTipRecipe();
			for (TipRecipe CP : listCP) {
				System.out.println(CP);
				//log.info(CP);
			}
		} catch (Exception e) {
			e.printStackTrace(); //예외 결과를 화면에 호출함
		}
	}
	
	//@Test
	public void testSelectAllTipRecipeCP() {
		//public List<TipRecipe> selectAllTipRecipe();
		try {
			List<TipRecipeCookingPreocess> listCP = recipeMapper.selectAllTipRecipeCP();
			for (TipRecipeCookingPreocess CP : listCP) {
				System.out.println(CP);
				//log.info(CP);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
//<!-- E.11.30 -->