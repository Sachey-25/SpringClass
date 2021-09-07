package SpringBootAnnotations;

import org.springframework.beans.factory.annotation.Required;

public class machine {
	
	private Integer cost;

	public Integer getCost() {
		return cost;
	}
	@Required
	public void setCost(Integer cost) {
		this.cost = cost;
	}
}
