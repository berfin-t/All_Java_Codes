
public class Invoice implements Payable {
	
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice (String partN, String partD, int quant, double priceP) {
		
		partNumber = partN;
		partDescription = partD;
		setQuantity(quant);
		setPricePerItem(priceP);
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity >= 0) 
			this.quantity = quantity;
		else
			throw new IllegalArgumentException("Quantity must be >= 0");
			
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem >= 0.0)
			this.pricePerItem = pricePerItem;
		else
			throw new IllegalArgumentException("Price must be >= 0.0");
	}
	
	public String toString() {
		return  "\nInvoice: " 
				+ "\nPart Number: " + getPartNumber()
				+ "\nQuantity: " + getQuantity() 
				+ "\nPrice Per Item: " + getPricePerItem();
	}
	
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem();
	}

}
