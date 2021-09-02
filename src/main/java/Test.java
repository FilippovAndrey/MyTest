import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class Test {
    private static TestInterface testInterface;

    public static void main(String args[]){
        TestInterface a = new TestA();
        a.executeUselessCommand();

    }
}


interface TestInterface{
    void executeUselessCommand();
}

class TestA implements TestInterface {
    @Override
    public void executeUselessCommand(){
        System.out.println("A");
    }
}

class TestB implements TestInterface {
    @Override
    public void executeUselessCommand() {
        System.out.println("B");
    }
}
