
public class Main {

	public static void main(String[] args) {
		// static = vse co trida vlastni sdili s promennyma a metodama 
		
		
		Friend friend1 = new Friend("spangbob");
		Friend friend2 = new Friend("patric");
		
		//System.out.println(Friend.numberOffFriends);
		//System.out.println(friend1.numberOffFriends); // je mozne pristoupit ke stejne hodnote ale neni to doporucene
		Friend.displayFriend(); // kdyz nebude static nemohu ji volat pres classu , ale primo pres jeden objek jako je nize
		//friend1.displayFriend();
	}

}
