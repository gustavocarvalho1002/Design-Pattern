package creator;

import product.Document;

public abstract class Application {

	protected Document document;
	
	//Factory Method Abstraction, returning a product
	public abstract Document createDocument(String codeDoc);
	
	public void sendDocument(){
		System.out.println("Sending document by e-mail: " + this.document.getDocumentCode());
	}
}
