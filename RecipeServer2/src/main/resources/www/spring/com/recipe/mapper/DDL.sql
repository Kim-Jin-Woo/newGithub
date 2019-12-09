-- 계정 잠기면 써야 할것
alter user ora_user account UNLOCK;


-- S.11.30 -- 
drop table replyBoard;
drop table tipRecipeCP;
drop table tipRecipe;
-- E.11.30 --

drop table recipeIngreMap;
drop table CTemaRecipeMap;
drop table cookingprocess;
drop table categorytema;
drop table recipe;
drop table RecipeIngredients;

-- S.11.30 -- 
drop sequence seq_reply;
-- E.11.30 -- 
drop sequence seq_RecipeIngredients;
drop sequence seq_recipeIngreMap;
drop sequence seq_CTemaRecipeMap;
drop sequence seq_cookingprocess;
drop sequence seq_recipe;

select * from RecipeIngredients;
select * from recipe;
select * from recipeIngreMap;
select * from cookingprocess;

-- S.11.30 -- 
create sequence seq_reply;
-- E.11.30 -- 
create sequence seq_RecipeIngredients;
create sequence seq_recipeIngreMap;
create sequence seq_CTemaRecipeMap;
create sequence seq_recipe;
create sequence seq_cookingprocess;

create table RecipeIngredients(
	recipeIngredientsId number,
	name varchar2(20) not null,
	-- 1레시피, 0재료
	descrimi char(1) not null,
	
	constraint pk_RecipeIngredients primary key(recipeIngredientsId)
);

create table recipe(
	recipeId number,
	views number not null,
	goodAamount number not null,
	badAamount number not null,
	recipeIngredientsId number,
	
	constraint pk_recipe primary key(recipeId),
	constraint fk_recipe4RecipeIngredients foreign key(recipeIngredientsId) references RecipeIngredients(recipeIngredientsId)
);

create table recipeIngreMap(
	recipeIngredientsId number, 
	recipeId number,
	
	constraint fk_recipeIngreMap4RecipeIngredientsId foreign key(recipeIngredientsId) references RecipeIngredients(recipeIngredientsId),
	constraint fk_recipeIngreMap4recipeId foreign key(recipeId) references recipe(recipeId),
    primary key(recipeIngredientsId, recipeId)
);

create table categorytema(
	categorytemaId number,
	name varchar2(20) not null,
	
	constraint pk_categorytema primary key(categorytemaId)
);

create table cookingprocess(
	cpId number ,
	recipeId number ,
	processNumber number not null,
	process varchar2(200) not null,
	
	constraint pk_cookingprocess primary key(cpId),
	constraint fk_cookingprocess foreign key(recipeId) references recipe(recipeId)
);

create table CTemaRecipeMap(
	categorytemaId number,
	recipeId number,
	
	constraint fk_CTemaRecipeMap4categorytemaId foreign key(categorytemaId) references categorytema(categorytemaId),
	constraint fk_CTemaRecipeMap4recipeId foreign key(recipeId) references recipe(recipeId),
    primary key(categorytemaId, recipeId)
);

-- S.11.30 --
--꿀립 레시피 
create table tipRecipe(
	tipRecipeId number,
	addRecipeIngredients varchar2(20),
	recipeId number,
	
	constraint fk_tipRecipeId4recipeId foreign key(recipeId) references recipe(recipeId),
	constraint pk_tipRecipeId primary key(tipRecipeId)
);

--꿀팁 레시피 조리 과정
create table tipRecipeCP(
	tipRecipeCPId number,
	tiprecipeId number,
	processNumber number not null,
	process varchar2(200) not null,
	
	constraint fk_tipRecipeCPId4RecipeId foreign key(tipRecipeId) references tipRecipe(tipRecipeId),
	constraint pk_tipRecipeCPId primary key(tipRecipeCPId)
);


	
--recipeId,content,replyer,regdate,updatedate;
--댓글 만들기
create table reply(
	replyId number,
	recipeId number,
	replyerId number,
	content varchar2(2000) not null,
	regdate date default sysdate,
	updatedate date default sysdate,
	
	constraint fk_reply4recipeId foreign key(recipeId) references recipe(recipeId),
	constraint pk_replyId primary key(replyId)
);
-- E.11.30 --

--index
create index index_RecipeIngredients_descrimi on RecipeIngredients(descrimi);
create index index_recipe_recipeIngredientsId on recipe(recipeIngredientsId);
create index index_cookingprocess_recipeId on cookingprocess(recipeId);

drop index index_RecipeIngredients_descrimi;
drop index index_recipe_recipeIngredientsId

--sample data
insert into categorytema(categorytemaId, name)
	values(1, 'Category');
insert into categorytema(categorytemaId, name)
	values(2, 'Tema');
insert into categorytema(categorytemaId, name)
	values(3, 'KoreanFood');
insert into categorytema(categorytemaId, name)
	values(4, 'JapanFood');	
insert into categorytema(categorytemaId, name)
	values(5, 'ChinaFood');
insert into categorytema(categorytemaId, name)
	values(6, 'westernfood');
insert into categorytema(categorytemaId, name)
	values(7, 'AsianFood');
insert into categorytema(categorytemaId, name)
	values(8, 'SnackBar');
insert into categorytema(categorytemaId, name)
	values(9, 'MidnightSnack');
insert into categorytema(categorytemaId, name)
	values(10, 'Etc');
insert into categorytema(categorytemaId, name)
	values(11, 'Diet');
insert into categorytema(categorytemaId, name)
	values(12, 'HighProtein');
insert into categorytema(categorytemaId, name)
	values(13, 'LowSalt');
insert into categorytema(categorytemaId, name)
	values(14, 'Vegetarian');
