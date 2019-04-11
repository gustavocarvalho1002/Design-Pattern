package test;

import concreteCreator.MyApplication;
import product.Document;

public class Teste {

	/**
	 * Testando o Padrão Method Factory by Milene
	 */
	public static void main(String[] args) {

		MyApplication myApplication = new MyApplication();
		Document myDocument = myApplication.createDocument("001_MyPDFDocument");
		myDocument.open();
		myDocument.record();
		myDocument.close();
		myApplication.sendDocument();
	}

}
