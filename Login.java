import java.util.ArrayList;

public class Login {
	User loggedIn = null; // User that is currently logged in. JB
	ArrayList<User> userList = new ArrayList<User>(); // All user profiles. JB

	// Constructor takes no argument. At system start up no user should be logged in. JB
    public Login() {
		
    }

	// Replaces currently logged in user with the user specified as argument. JB
    public void login(User userIn) {
        this.loggedIn = userIn;
    }
	
	// Logs user out (replaces currently logged in user with null). JB
	public void logout(){
		this.loggedIn = null;
	}

	// TODO: ALL METHODS BELOW NEED TESTING BEFORE PULL REQUEST. JB
	// TODO: Ongoing - Methods below will need updating to keep up with any changes to constructors. JB
	
	// Methods to create users (of all types). No duplicate usernames.
	// All users created are added to Login's arraylist of users.
	// Other classes call methods of Login to get hold of them.
	// Return false if entered username was already taken. JB
	// TODO: Manager, Waiter, Chef, Driver, Customer
	public boolean newManager(String username, String password, String firstName, String lastName, int staffId, String homeAddress){
		for(User u : userList){
			if(u.checkUsername(username)){
				return false;
			}
		}
		userList.add(new Manager(username, password, firstName, lastName, staffId, homeAddress));
		return true;
	}
	
	public boolean newWaiter(String username, String password, String firstName, String lastName, int staffId, String homeAddress){
		for(User u : userList){
			if(u.checkUsername(username)){
				return false;
			}
		}
		userList.add(new Waiter(username, password, firstName, lastName, staffId, homeAddress));
		return true;
	}
	
	public boolean newChef(String username, String password, String firstName, String lastName, int staffId, String homeAddress){
		for(User u : userList){
			if(u.checkUsername(username)){
				return false;
			}
		}
		userList.add(new Chef(username, password, firstName, lastName, staffId, homeAddress));
		return true;
	}
	
	public boolean newDriver(String username, String password, String firstName, String lastName, int staffId, String homeAddress){
		for(User u : userList){
			if(u.checkUsername(username)){
				return false;
			}
		}
		userList.add(new Driver(username, password, firstName, lastName, staffId, homeAddress));
		return true;
	}
	
	public boolean newCustomer(String username, String password, String firstName, String lastName, String homeAddress, int customerId){
		for(User u : userList){
			if(u.checkUsername(username)){
				return false;
			}
		}
		userList.add(new Customer(username, password, firstName, lastName, homeAddress, customerId));
		return true;
	}
	
	// Checks what type of user is logged in and returns as string. JB
	public String checkLoggedInUserType(){
		if(loggedIn instanceof Manager) return "Manager";
		if(loggedIn instanceof Waiter) return "Waiter";
		if(loggedIn instanceof Driver) return "Driver";
		if(loggedIn instanceof Chef) return "Chef";
		if(loggedIn instanceof Customer) return "Customer";
		return "Invalid subclass";
	}
	
	// Checks what type of user was passed as argument to this method and returns as string. JB
	public String checkUserType(User userIn){
		if(userIn instanceof Manager) return "Manager";
		if(userIn instanceof Waiter) return "Waiter";
		if(userIn instanceof Driver) return "Driver";
		if(userIn instanceof Chef) return "Chef";
		if(userIn instanceof Customer) return "Customer";
		return "Invalid subclass";
	}
	
	// Checks username and password for matching user. If found log user in.
	// Returns true if a user was logged in and false if invalid (for the sake of output). JB
	public boolean loginWithCredentials(String username, String password){
		for(User u : userList){
			if(u.checkCredentials(username, password)){
				this.loggedIn = u;
				return true;
			}
		}
		return false;
	}

	public User getUserFromUsername(String username){
    	for(User u : userList){
    		if(u.getUsername().equals(username)){
    			return u;
    		}
		}
    	return null;
	}
}