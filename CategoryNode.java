public class CategoryNode{
    public String category;
    public PersonList data;
    public CategoryNode next;
    public CategoryNode prev;
    
    public CategoryNode(String category){
        this.category = category;
        next = prev = null;
        data = null; 
    }
    
    public CategoryNode(String category, PersonList list){
        this.category = category;
        data = list;
    }
}