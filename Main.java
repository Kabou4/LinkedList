//inclass exercise 6
//3 of 3
public class Main {
    public static void main(String[] args){
        MyList list1 = new MyList();
        list1.insert_head(6);
        list1.insert_head(5);
        list1.insert_head(4);
        list1.insert_head(3);
        list1.insert_head(2);
        list1.insert_head(1);
        list1.insert_head(0);

        System.out.println("The first node in the list is: " + list1.front());
        System.out.println("The size of the list is: " + list1.size());
        list1.display();
        list1.delete_head();
        list1.display();

        list1.insert_back(-1);
        list1.insert_back(-2);
        list1.insert_back(-3);
        list1.insert_back(-4);
        list1.insert_back(-5);
        list1.insert_back(-6);

        System.out.println("The last node in the list is: " + list1.get_back());
        list1.display();
        list1.delete_back();
        list1.display();



    }
}
