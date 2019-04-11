package concreteCreator;

import concreteProduct.MyPDFDocument;
import product.Document;
import creator.Application;

public class MyApplication extends Application {

	@Override
	public Document createDocument(String codeDoc) {
		super.document = new MyPDFDocument(codeDoc);
		return super.document;
	}

}
