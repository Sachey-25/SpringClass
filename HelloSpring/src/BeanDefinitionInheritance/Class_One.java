package BeanDefinitionInheritance;

public class Class_One {
	private String message_one;
	private String message_two;
	
	public void setMessage_one(String message) {
		this.message_one=message;
	}
	public void setMessage_two(String message) {
		this.message_two=message;
	}
	
	public void getMessage_one() {
		System.out.println("Message class one :" + message_one);
	}
	public void getMessage_two() {
		System.out.println("second Message class one :" + message_two);
	}

}
