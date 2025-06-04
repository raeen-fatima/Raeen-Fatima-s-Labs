package Interface;

interface NestedInterface {
    void methX();
    void methY();
    
}
interface InnerNestedInterface extends NestedInterface {
    void methZ();
}

class NestedInterfaceExample implements InnerNestedInterface {
    @Override
    public void methX() {
        System.out.println("methX() from NestedInterfaceExample");
    }
    @Override
    public void methY() {
        System.out.println("methY() from NestedInterfaceExample");
    }
    @Override
    public void methZ() {
        System.out.println("methZ() from NestedInterfaceExample");
    }
}

public class NestedInterfaceTest {
    public static void main(String[] args) {
        NestedInterfaceExample obj = new NestedInterfaceExample();

        obj.methX();
        obj.methY();
        obj.methZ();
    }
}
