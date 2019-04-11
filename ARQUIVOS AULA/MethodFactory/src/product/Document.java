package product;

public abstract class Document {
	
	private String documentCode;
	
	public Document(String docCode) {
		this.setDocumentCode(docCode);
	}
	
	public abstract void open();
	
	public abstract void close();
	
	public abstract void record();

	public String getDocumentCode() {
		return documentCode;
	}

	public void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}

}
