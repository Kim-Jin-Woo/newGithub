// -- S.11.30 --
package www.spring.com.recipe.model;

public class TipRecipeCookingPreocess {

	private int tipRecipeCPId;
	private int tiprecipeId;
	private int processNumber;
	private String process;
	
	public TipRecipeCookingPreocess() {
	}

		
	public int getTipRecipeCPId() {
		return tipRecipeCPId;
	}

	public void setTipRecipeCPId(int tipRecipeCPId) {
		this.tipRecipeCPId = tipRecipeCPId;
	}

	public int getTiprecipeId() {
		return tiprecipeId;
	}

	public void setTiprecipeId(int tiprecipeId) {
		this.tiprecipeId = tiprecipeId;
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

	@Override
	public String toString() {
		return "TipRecipeCookingPreocess [tipRecipeCPId=" + tipRecipeCPId + ", tiprecipeId="
	+ tiprecipeId + ", processNumber=" + processNumber + ", process=" + process + "]";
	}

}
//-- E.11.30 --