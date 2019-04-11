package test;

import componente.Stretch;
import composite.Path;
import leaf.*;

public class CompositeTest {

	public static void main(String[] args) {
		Stretch stretch01 = new StretchByFoot("Go to the corner of Sherbourne Street and Dundas Street.", 500);
		Stretch stretch02 = new StretchByCar("Continue straight on Dundas Street.", 1500);
		Stretch stretch03 = new StretchByCar("Turn right when you see a big Supermarket.", 500);
		Stretch stretch04 = new StretchBySubway("Try to park at the supermarket, corner of Dundas Street and Oliver Street." +
		"\n Continue by using the subway, from Oliver's station to University's station.", 1000);
		
		Path path1 = new Path();
		path1.addStretch(stretch01);
		path1.addStretch(stretch02);
		System.out.println("First Path: ");
		System.out.println("Printing the path, composed by different stretches...");
		path1.printStretch();
		
		Path path2 = new Path();
		path2.addStretch(path1);
		path2.addStretch(stretch03);
		System.out.println("--------------");
		System.out.println("Second Path: ");
		System.out.println("Printing the path, composed by different stretches...");
		path2.printStretch();
		
		Path path3 = new Path();
		path3.addStretch(path2);
		path3.addStretch(stretch04);
		System.out.println("--------------");
		System.out.println("Third Path: ");
		System.out.println("Printing the path, composed by different stretches...");
		path3.printStretch();	
	}
}
