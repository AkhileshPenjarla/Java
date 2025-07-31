package projects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class User{
	private String username;
	private String password;
	
	public User(String username,String password) {
		this.username=username;
		this.password=password;
	}
	public String getusername() {
		return username;
	}
	public String getpassword() {
		return password;
	}
}
public class Authenticationsystem {
	
	private LinkedList<User>UserList;
	
	public Authenticationsystem() {
		UserList=new LinkedList<>();
	}
	public void register(String username,String password) {
		User newuser=new User(username,password);
		UserList.add(newuser);
		System.out.println("new Registered Successfully");
	}
	
	public boolean login(String username,String password) {
		for(User user:UserList) {
			if(user.getusername().equals(username) &&user.getpassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Authenticationsystem authsystem=new Authenticationsystem();
		Scanner sc=new Scanner(System.in);
		
		boolean loggedin=false;
		while(!loggedin) {
			System.out.println("Choose an Option ");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter username: ");
				String regusername=sc.nextLine();
				System.out.println("Enter Password: ");
				String regpassword=sc.nextLine();
				authsystem.register(regusername, regpassword);
				break;
				
			case 2:
				System.out.println("Enter username: ");
				String loginusername=sc.nextLine();
				System.out.println("Enter Password: ");
				String loginpassword=sc.nextLine();
				if(authsystem.login(loginusername, loginpassword)) {
					System.out.println("Login successfully ..");
					loggedin=true;
				}else {
					System.out.println("Login Failed...");
				}
				break;
			
			case 3:
				System.out.println("Existing ...");
				loggedin=true;
				break;
				
			default:
				System.out.println("Invalid choice, Try again..");
								
			}
		}

	}

}
