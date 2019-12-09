package www.spring.com.recipe.model;

/**
 * 조리과정을 담을 수 있는 클레스 입니다.
 * @author user
 *
 */
public class CookingProcess {
	private int cpId;
	private int recipeId;
	//조리 순서에 해당 합니다.
	private int processNumber;
	//조리 방법입니다.
	private String process;
	
	public CookingProcess() {
	}

	public int getCpId() {
		return cpId;
	}
	
	public void setCpId(int cpId) {
		this.cpId = cpId;
	}
	
	public int getProcessNumber() {
		return processNumber;
	}
	
	public void setProcessNumber(int processNumber) {
		this.processNumber = processNumber;
	}
	
	public String getProcess() {
		return process;
	}
	
	public void setProcess(String process) {
		this.process = process;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	@Override
	public String toString() {
		return "CookingProcess [cpId=" + cpId + ", recipeId=" + recipeId + ", processNumber=" + processNumber
				+ ", process=" + process + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpId;
		result = prime * result + ((process == null) ? 0 : process.hashCode());
		result = prime * result + processNumber;
		result = prime * result + recipeId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CookingProcess other = (CookingProcess) obj;
		if (cpId != other.cpId)
			return false;
		if (process == null) {
			if (other.process != null)
				return false;
		} else if (!process.equals(other.process))
			return false;
		if (processNumber != other.processNumber)
			return false;
		if (recipeId != other.recipeId)
			return false;
		return true;
	}
	
	
}
