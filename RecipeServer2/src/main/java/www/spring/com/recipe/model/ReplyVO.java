//S11.30
package www.spring.com.recipe.model;

import java.util.Date;

public class ReplyVO {
	private int replyId;
	private int recipeId;
	private int replyerId;
	private String content;
	private Date regdate;
	private Date updatedate;
	
	public ReplyVO() {
	}

	public ReplyVO(int recipeId, String content, int replyerId) {
		this.recipeId = recipeId;
		this.content = content;
		this.replyerId = replyerId;
	}

	
	public String getContent() {
		return content;
	}
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public int getReplyerId() {
		return replyerId;
	}
	public void setReplyerId(int replyerId) {
		this.replyerId = replyerId;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
//E11.30