package www.spring.com.recipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import www.spring.com.recipe.service.RecipeService;

/**
 * 안드로이드 어플에서 올 request를 컨트롤 해줄 아이입니다.
 * @author user
 *
 */
@Controller
@RequestMapping("/")
public class RecipeRquestController {
	@Autowired
	RecipeService boardService;
	
	/**
	 * 레시피의 목록을 반환합니다.
	 * @param model
	 * @return
	 */
	@RequestMapping("/list")
	public String lsitRecipe(Model model) {
		return "";
	}
}
