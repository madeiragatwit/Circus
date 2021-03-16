import java.util.*;
public class PersonList{
    private PersonNode front;
    public PersonList(){
        front = null;
    }
    
    public void add(PersonNode n){
        if(front == null){
            front = n;
        }else{
            PersonNode current = front;
            while(current.next != null){
                current = current.next;
            }
            current.next = n;
            current.next.prev = current; 
        }
    }
    
    public String toString(){
        if (front == null) {
            return "[]";
        } else {
            String result = "" + front.firstName + " " + front.middleName + " " + front.lastName + " " + front.ID + " " + front.category + " " + front.nickname;
            PersonNode current = front.next;
            while (current != null) {
                result += "\n" + current.firstName + " " + current.middleName + " " + current.lastName + " " + current.ID + " " + current.category + " " + current.nickname;
                current = current.next;
            }
            return result;
    }
    }
}