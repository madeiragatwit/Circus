import java.io.*;
import java.util.*;
public class CLIENT{
    public static void main() throws FileNotFoundException{
        Scanner n = new Scanner(new File("CircusEmployees.txt"));
        //PersonList list = new PersonList();
        categoryTree tree;
        CategoryNode curr;
        
        String s = n.nextLine();
        PersonNode m = processLine(s);

        tree = new categoryTree(new CategoryNode(m.category));
        curr = tree.getCategory(m.category); 
        curr.data = new PersonList();
        curr.data.add(m);
       
        while(n.hasNextLine()){
            s = n.nextLine();
            m = processLine(s);
            
            if(tree.getCategory(m.category) == null) {
                tree.add(new CategoryNode(m.category));
                curr = tree.getCategory(m.category);
                curr.data = new PersonList();
                curr.data.add(m);
            } else {
                curr = tree.getCategory(m.category);
                curr.data.add(m);
            }
        }
    }

    public static PersonNode processLine(String s) {
        Scanner data = new Scanner(s);
        String first = data.next();;
        String middle = data.next();
        String last = data.next();
        String ID = data.next();
        String category = data.next();
        String nickname= data.next();
        return new PersonNode(first, middle, last, ID, category, nickname);
    }
}