package test;

import abstractPart.AbstractClass;
import concretePart.ConcreteClass;

public class TemplateMethodTest {

	/**
	 * Testing the Template Method Pattern...
	 */
	public static void main(String[] args) {
		AbstractClass generic = new ConcreteClass();
		generic.templateMethod();

	}

}
