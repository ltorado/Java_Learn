
public class Friend {
	String name;
	
	static int numberOffFriends;
	
	Friend(String name){
		this.name=name;
		numberOffFriends++;
	}
	
	static void displayFriend() {
		System.out.println("You have plas"+numberOffFriends);
	}
}
