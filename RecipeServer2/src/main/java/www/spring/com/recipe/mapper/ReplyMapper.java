package www.spring.com.recipe.mapper;

import java.util.List;

import www.spring.com.recipe.model.ReplyVO;

public interface ReplyMapper {
	public List<ReplyVO> getReply();
	public int insertReply(ReplyVO replyVO);
}
