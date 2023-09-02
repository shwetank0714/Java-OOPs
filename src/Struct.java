import javax.security.auth.Destroyable;

public class Struct {

    private int val;
    private Struct next;

    Struct(int val){
        this.val = val;
        this.next = null;
    }

    public void changeNodeVal(int val){
        this.val = val;
    }

    public int getNodeVal(){
        return this.val;
    }

    public void changeNext(Struct nextNode){
        this.next = nextNode;
    }
}
