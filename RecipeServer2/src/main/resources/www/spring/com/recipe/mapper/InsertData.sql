insert into RecipeIngredients(RecipeIngredientsId, name, descrimi)
	values(1, '김치찌개', '1');
insert into RecipeIngredients(RecipeIngredientsId, name, descrimi)
	values(2, '된장찌개', '1');
insert into RecipeIngredients(RecipeIngredientsId, name, descrimi)
	values(3, '김치부침개', '1');
insert into RecipeIngredients(RecipeIngredientsId, name, descrimi)
	values(4, '김치', '0');
insert into RecipeIngredients(RecipeIngredientsId, name, descrimi)
	values(5, '두부', '0');
insert into RecipeIngredients(RecipeIngredientsId, name, descrimi)
	values(6, '된장', '0');
insert into RecipeIngredients(RecipeIngredientsId, name, descrimi)
	values(7, '부침가루', '0');
insert into RecipeIngredients(RecipeIngredientsId, name, descrimi)
	values(8, '양파', '0');
insert into RecipeIngredients(RecipeIngredientsId, name, descrimi)
	values(9, '마늘', '0');


insert into recipe(recipeId, views, goodAamount, badAamount, RecipeIngredientsId)
	values(1, 20000, 1004, 20, 1);
insert into recipe(recipeId, views, goodAamount, badAamount, RecipeIngredientsId)
	values(2, 15400, 654, 15, 2);
insert into recipe(recipeId, views, goodAamount, badAamount, RecipeIngredientsId)
	values(3, 60000, 5014, 40, 3);
	

insert into recipeIngreMap(recipeId, RecipeIngredientsId)
	values(1, 4);
insert into recipeIngreMap(recipeId, RecipeIngredientsId)
	values(1, 5);
insert into recipeIngreMap(recipeId, RecipeIngredientsId)
	values(1, 8);
insert into recipeIngreMap(recipeId, RecipeIngredientsId)
	values(1, 9);
insert into recipeIngreMap(recipeId, RecipeIngredientsId)
	values(2, 5);
insert into recipeIngreMap(recipeId, RecipeIngredientsId)
	values(2, 6);
insert into recipeIngreMap(recipeId, RecipeIngredientsId)
	values(2, 8);
insert into recipeIngreMap(recipeId, RecipeIngredientsId)
	values(2, 9);
insert into recipeIngreMap(recipeId, RecipeIngredientsId)
	values(3, 4);
insert into recipeIngreMap(recipeId, RecipeIngredientsId)
	values(3, 7);
insert into recipeIngreMap(recipeId, RecipeIngredientsId)
	values(3, 8);

insert into cookingprocess(cpId, recipeId, processNumber, process)
	values(1, 1, 1, '김치와 두부, 양파를 먹기 좋은 크기로 잘개 썬다');
insert into cookingprocess(cpId, recipeId, processNumber, process)
	values(2, 1, 2, '김치를 볶는다.');
insert into cookingprocess(cpId, recipeId, processNumber, process)
	values(3, 1, 3, '물을 넣고 나머지 재료를 넣고 끓인다.');
insert into cookingprocess(cpId, recipeId, processNumber, process)
	values(4, 1, 4, '10분간 끓이면 맛있는 김치찌개 완성');
insert into cookingprocess(cpId, recipeId, processNumber, process)
	values(5, 2, 1, '두부와 양파를 먹기 좋은 크기로 썬다.');
insert into cookingprocess(cpId, recipeId, processNumber, process)
	values(6, 2, 2, '물을 넣고 재료를 넣고 끓인다.');
insert into cookingprocess(cpId, recipeId, processNumber, process)
	values(7, 2, 3, '5분간 끓인후 된장을 거름망을 이용해 푼다.');
insert into cookingprocess(cpId, recipeId, processNumber, process)
	values(8, 2, 4, '된장 냄새가 나면 맛있는 된장찌개 완성');
insert into cookingprocess(cpId, recipeId, processNumber, process)
	values(9, 3, 1, '김치와 양파를 잘개 썬다.');
insert into cookingprocess(cpId, recipeId, processNumber, process)
	values(10, 3, 2, '부침가루와 재료를 잘 섞는다.');
insert into cookingprocess(cpId, recipeId, processNumber, process)
	values(11, 3, 3, '기름을 두르고 부치면 완성~');


insert into tipRecipe(tipRecipeId, addRecipeIngredients, recipeId)
	values(1,'돼지고기', 1);
insert into tipRecipe(tipRecipeId, addRecipeIngredients, recipeId)
	values(2,'치즈', 2);
insert into tipRecipe(tipRecipeId, addRecipeIngredients, recipeId)
	values(3,'한우고기', 3);

insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(1, 1, 1, '김치와 두부, 양파를 먹기 좋은 크기로 잘개 썬다');
insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(2, 1, 2, '돼지고기 넣는다.');
insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(3, 1, 3, '김치를 볶는다.');
insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(4, 1, 4, '물을 넣고 나머지 재료를 넣고 끓인다.');
insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(5, 1, 5, '10분간 끓이면 맛있는 김치찌개 완성');
insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(6, 2, 1, '두부와 양파를 먹기 좋은 크기로 썬다.');
insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(7, 2, 2, '물을 넣고 재료를 넣고 끓인다.');
insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(8, 2, 3, '5분간 끓인후 된장을 거름망을 이용해 푼다.');
insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(9, 2, 4, '치즈를 된장찌개에 얹는다');
insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(10, 2, 5, '치즈와 된장 냄새가 나면 맛있는 된장찌개 완성');
insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(11, 3, 1, '김치와 양파를 잘개 썬다.');
insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(12, 3, 2, '한우고기를 볶아 넣는다.');
insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(13, 3, 3, '부침가루와 재료를 잘 섞는다.');
insert into tipRecipeCP(tipRecipeCPId, tiprecipeId, processNumber, process)
	values(14, 3, 4, '기름을 두르고 부치면 완성~');

	
insert into CTemaRecipeMap(categorytemaId, recipeId)
	values(1, 'Category');
	
insert into categorytema(categorytemaId, name)
	values(1, 'Category');
	

