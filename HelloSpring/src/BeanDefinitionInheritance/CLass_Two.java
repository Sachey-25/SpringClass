package BeanDefinitionInheritance;

public class CLass_Two {
	
	private String message_one;
	private String message_two;
	private String message_three;
	
	public void setMesssage_one(String message) {
		this.message_one=message;
	}
	public void setMesssage_two(String message) {
		this.message_two=message;
	}
	public void setMesssage_three(String message) {
		this.message_three=message;
	}
	public void getMessage_one() {
		System.out.println("class two message one : " + message_one);
	}
	public void getMessage_two() {
		System.out.println("class two message one : " + message_two);
	}
	public void getMessage_three() {
		System.out.println("class two message one : " + message_three);
	}
	

}
