public class MenuItem {
	private String name;
    private String description;
	private float price;
	private boolean onMenu;
	private boolean currentSpecial;
	
	// Constructor
	public MenuItem(String name, String description, float price, boolean onMenu, boolean isSpecial){
		this.name = name;
		this.description = description;
		this.price = price;
		this.onMenu = onMenu;
		this.currentSpecial = currentSpecial;
	}
	
	// Getters & Setters
	public String getName(){
		return this.name;
	}
	
	public void setName(String newName){
		this.name = newName;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setDescription(String newDescription){
		this.description = newDescription;
	}
	
	public float getPrice(){
		return this.price;
	}
	
	public void setPrice(float newPrice){
		this.price = newPrice;
	}
	
	public boolean isOnMenu(){
		return this.onMenu;
	}
	
	public void setOnMenu(boolean onMenu){
		this.onMenu = onMenu;
	}
	
	public boolean isSpecial(){
		return this.currentSpecial;
	}
	
	public void setSpecial(boolean special){
		this.currentSpecial = special;
	}
}