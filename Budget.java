import java.util.ArrayList;

public class Budget {
	//TODO: Later add in monthly/weekly/annual goals
	private String name;
	private double totalAmount;
	private ArrayList <Category> categories;
	private int budgetType;
	private ArrayList <Purchase> purchases;
	
	public Budget(String name, int budgetType, double totalAmount, 
			ArrayList <Category> categories, ArrayList <Purchase> purchases) {
		this.setName(name);
		this.setTotalAmount(totalAmount);
		
		if (categories.size() == 0) {
			this.categories = new ArrayList <Category> ();
		}
		this.setCategories(categories);
		
		this.setBudgetType(budgetType);
		if (purchases.size() == 0) {
			this.purchases = new ArrayList <Purchase> ();
		}
		this.setPurchases(purchases);
		
		this.setBudgetType(budgetType);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		if (name == null) {
			throw new IllegalArgumentException();
		}
		this.name = name;
	}

	public double getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(double totalAmount) {
		if (totalAmount < 0) {
			throw new IllegalArgumentException();
		}
		this.totalAmount = totalAmount;
	}
	
	public ArrayList <Category> getCategories() {
		return categories;
	}
	
	public void setCategories(ArrayList <Category> categories) {
		if (categories == null) {
			throw new IllegalArgumentException();
		}
		this.categories = categories;
	}
	
	public int getBudgetType() {
		return budgetType;
	}
	
	public void setBudgetType(int budgetType) {
		//TODO: Add error case to budget type later
		/*if () {
			throw new IllegalArgumentException();
		}*/
		this.budgetType = budgetType;
	}
	
	public ArrayList <Purchase> getPurchases() {
		return purchases;
	}
	
	public void setPurchases(ArrayList <Purchase> purchases) {
		if (purchases == null) {
			throw new IllegalArgumentException();
		}
		this.purchases = purchases;
	}
	
	public String toString() {
		String rc = "";
		rc += "Budget name : "+name;
		rc += "\nBudget Type: "+budgetType;
		rc += "\nAmount: "+totalAmount;
		for (int i = 0; i < categories.size(); i++) {
			rc += "\nCategory: "+(i+1)+categories.get(i).getName();
		}
		for (int i = 0; i < purchases.size(); i++) {
			rc += "\nPurchase: "+(i+1)+purchases.get(i).getName();
		}
		return rc;:
	}
}
