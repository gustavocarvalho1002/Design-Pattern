package concreteProduct;

import product.Document;

public class MyPDFDocument extends Document {

	public MyPDFDocument(String docCode) {
		super(docCode);
	}

	@Override
	public void open() {
		System.out.println("My PDF Document is opened!");	
	}

	@Override
	public void close() {
		System.out.println("My PDF Document is closed!");	
	}

	@Override
	public void record() {
		System.out.println("My PDF Document is recorded!");		
	}
	
	
}
