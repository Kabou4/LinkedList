//inclass exercise 6 CS202
//Aboubacar D'Almeida
//Dr. Li, 18 February 2026
//1 of 3
public class Node{ //usually this class is made private, however due to 3 files, it is easier to make public
    //data fiels
    private int data; 
    protected Node next;//public/protected makes loop structure easier as opposed to private

    //methods
    public Node(int dataItem){
        data = dataItem;
        next = null;
    }

    public Node(int dataItem, Node nodeRef){
        data = dataItem;
        next = nodeRef;
    
    }

    public int get_data(){
        return data;
    }

    //public Node set_next(next){

    //}
    //public Node get_next(){
    //    return next;
    //}

}