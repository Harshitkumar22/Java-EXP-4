//3. Create a Club class with a static variable clubName and a non-static variable memberName.
//Provide a static method displayClubName() to print the club’s name.Create multiple Club objects and assign different member names to each.
//Objective: Show how the static variable clubName is shared across all instances, while memberName remains unique to each object. 
//Prove this by displaying each member’s name alongside the shared club name.


class Club{
    private static String clubName = "Tech Enthusiasts Club";  // Static variable

    private String memberName;

    public Club(String memberName){   // Constructor to initialize memberName
        this.memberName=memberName;
    }

    public static void displayClubName(){   // Static method to display club name
        System.out.println("Club Name: " + clubName);
    }

    public void displayMemberDetails(){
        System.out.println("Member Name: " + memberName + " | Club: " + clubName);
    }

    public static void main(String[] args){
        Club.displayClubName();

        // Creating multiple objects with different member names
        Club member1 = new Club("Harshit");
        Club member2 = new Club("Dhairya");
        Club member3 = new Club("Prince ");

        member1.displayMemberDetails();
        member2.displayMemberDetails();
        member3.displayMemberDetails();
    }
}
