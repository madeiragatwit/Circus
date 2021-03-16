public class PersonNode{
    public String firstName;
    public String middleName;
    public String lastName;
    public String ID;
    public String category;
    public String nickname;
    public PersonNode next;
    public PersonNode prev;
    public PersonNode(String first, String middle, String last, String Id, String cat, String nick){
        firstName = first;
        middleName = middle;
        lastName = last;
        ID = Id;
        category = cat;
        nickname = nick;
    }
    
}