package concretePart;

import abstractPart.AbstractClass;

public class ConcreteClass extends AbstractClass {

	public ConcreteClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		System.out.println("Implementing the body of the operation1, specific for this ConcreteClass");

	}

	@Override
	public void operation2() {
		// TODO Auto-generated method stub
		System.out.println("Implementing the body of the operation2, specific for this ConcreteClass");

	}

	@Override
	public void operation3() {
		// TODO Auto-generated method stub
		System.out.println("Implementing the body of the operation3, specific for this ConcreteClass");
	}

}
