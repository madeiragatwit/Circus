import java.util.*;

public class categoryTree
{
    public CategoryNode category;

    public categoryTree() {
        category = null;
    }

    public categoryTree(CategoryNode c) {
        category = c;
    }

    public void add(CategoryNode u)
    {
        if(category.category.compareTo(u.category) > 0) {
            if(category.prev == null) {
                category.prev = u;
            } else {
                add(category.prev, u);
            }
        } else {
            if(category.next == null) {
                category.next = u;
            } else {
                add(category.next, u);
            }
        }
    }

    private void add(CategoryNode t, CategoryNode u) {
        if(t.category.compareTo(u.category) > 0) {
            if(t.prev == null) {
                t.prev = u;
            } else {
                add(t.prev, u);
            }
        } else {
            if(t.next == null) {
                t.next = u;
            } else {
                add(t.next, u);
            }
        }
    }

    public CategoryNode getCategory(String n) {
        return getCategory(category, n);
    }

    private CategoryNode getCategory(CategoryNode t, String n) {
        if(t == null) {
            return null;
        }else if(t.category.equals(n)) {
            return t;
        } else if(t.category.compareTo(n) >= 0){
            return getCategory(t.prev, n);
        } else{
            return getCategory(t.next, n);
        }
    }

    public void print() {
        printInorder(category);
        System.out.println();
    }

    private void printInorder(CategoryNode cat) {
        if (category != null) {
            printInorder(cat.prev);
            System.out.print(cat.category + " ");
            printInorder(cat.next);
        }
    }

}

