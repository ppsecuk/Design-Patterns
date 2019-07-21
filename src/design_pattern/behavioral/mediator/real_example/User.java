package design_pattern.behavioral.mediator.real_example;

public abstract class User {
	protected ChatMediator mediator;
	protected String name;
	
	User(ChatMediator med, String name){
		this.mediator=med;
		this.name=name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);
}
