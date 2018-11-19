package mysql.com.web.service;

// Just a class to create the getters and setters
public class Transaction {

	private String  unitPrice, quantity, id;
	private double  totalPrice;
	private String cardNumber, expDate, nameOnCard, createdOn, createdBy, cardType;

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String toString() {

		String results = new String();

		results = "[" + "Id: " + id + ",NameOnCard: " + nameOnCard + ",CardNumber: " + cardNumber + ",ExpDate:"
				+ expDate + ",UnitPrice:" + unitPrice + ",Quantity:" + quantity + ",TotalPrice: " + totalPrice
				+ ",CreatedOn:" + createdOn + ",CreatedBy:" + createdBy + ",CardType:" + cardType + "]\n";
		return results;

	}

}
