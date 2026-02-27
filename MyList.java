//inclass exercise 6
//2 of 3

public class MyList{
    //data fields
    private Node head = null;
    private int size = 0;

    //methods
    //a - returns data in the head, doesn't account for if it is empty
    public int front(){
        return head.get_data();
    }

    //b - returns size of the list
    public int size(){
        return size;
    }

    //c - creates new head of the list
    public void insert_head(int dataItem){
        //step 1 - create new node containing dataItem
        Node newNode = new Node(dataItem);
        //step 2 - Assign head of the old list as the next node for the new node
        newNode.next = head;
        //step 3 - Assign newNode as new head of the list
        head = newNode;

        //another solution:
        //head = newNode(dataItem, head); //creates a newNode, puts the dataItem, and then assign old head as next node and then assigns the newNode as head of new Node.
        size++; 
    }

    //d - delete the head
    public void delete_head(){
        head = head.next;
        size--;
    }

    //e - display the list
    public void display(){
        for(Node temp = head; temp != null; temp = temp.next){
            System.out.print(temp.get_data() + " -> ");
        }
        System.out.println("null");
    }

    //f - returns last item in list 
    public int get_back(){
        //step 1: loop structure to find last node in list
        Node temp;
        for(temp = head; temp.next != null; temp = temp.next){
        }
            //step 2: return data inside last node   
        return temp.get_data();
    }

    //g - insert a node as last value
    public void insert_back(int insert_me){
        //step 1: same loop as get_back
        Node temp;
        for(temp = head; temp.next != null; temp = temp.next){
        }
        //System.out.print(temp.get_data());
        //step 2: create new node containing insert_me value
        Node newNode = new Node(insert_me);
        //step 3: assign new node as next node to old last node of the list
        temp.next = newNode;        
        size++;
    }

    //h - deleting last node
    public void delete_back(){
        //step 1: find 2nd to last node
        Node temp;
        for(temp = head; temp.next.next != null; temp = temp.next){
        }
        //step 2: Assign next node to be null
        temp.next = null;
        size--;
    }

    //i - boolean search
    public boolean search(int target){
        //step 1: go through the nodes
        Node temp;
        for(temp = head; temp.next != null; temp = temp.next){
        //check data
            if(temp.get_data() == target) return true;
        }

        //if not found, then return false
        return false;
    }

    //j - method that inserts insert_me behind after_me item in the list 
    public void insert(int after_me, int insert_me){

        for(Node temp = head; temp != null; temp = temp.next){
    
            if(temp.get_data() == after_me){
    
                Node newNode = new Node(insert_me);
    
                newNode.next = temp.next; // connect forward
                temp.next = newNode;      // connect previous node
    
                size++;
                return;
            }
        }
    }
    public void remove(int delete_me){

        // case 1: empty list
        if(head == null) return;
    
        // case 2: delete head
        if(head.get_data() == delete_me){
            head = head.next;
            size--;
            return;
        }
    
        // case 3: delete after head
        Node temp;
        for(temp = head; temp.next != null; temp = temp.next){
    
            if(temp.next.get_data() == delete_me){
                temp.next = temp.next.next;
                size--;
                return;
            }
        }
    }
}