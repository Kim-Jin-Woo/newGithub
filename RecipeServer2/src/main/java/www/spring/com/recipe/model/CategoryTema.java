package www.spring.com.recipe.model;

/**
 * 카테고리와 테마의 Id가 있는 Enum클레스 입니다. 카테고리의 DB에 저정된 아이디를 반환 합니다. 
 * @author user
 *
 */
public enum CategoryTema {
	Category(1), Tema(2), KoreanFood(3), JapanFood(4), ChinaFood(5), 
	westernfood(6), AsianFood(7), SnackBar(8), MidnightSnack(9),
	Etc(10), Diet(11), HighProtein(12), LowSalt(13), Vegetarian(14);
	
	private CategoryTema(int t){}
	
	private int value;

	public int getValue() {
		return value;
	}
}
