package lyl.code.offer;

/**
 * Created by lyl on 2015/8/16.
 */
public class ReverseList {
   static class RList{
        int data;
        RList next;

        public RList(int data, RList next) {
            this.data = data;
            this.next = next;
        }
    }
    public static  RList Reverse(RList ihead){
        RList Head = null;
        RList node = ihead;
        RList pre = null;
        while(node !=null){
            RList next = node.next;
            if(next == null)
                Head = node;
            node.next =pre;
            pre = node;
            node = next;
        }
        return Head;
    }

    public static void main(String[] args){
        RList head = new RList(2,new RList(3,null));
        Reverse(head);
    }
}
