package Spring2022.Final.Five.A;

public class Outerclass {
    public int outerVar;
    
    public Outerclass(int outerVar) {
        this.outerVar = outerVar;
    }

    public void outerMethod() {
        // Create an instance of InnerClass
        InnerClass innerObj = new InnerClass(42);
        
        // Print the inner class's attribute innerVar
        System.out.println(innerObj.innerVar);
        
        // Call innerMethod
        innerObj.innerMethod();
    }
    
    class InnerClass {
        private int innerVar;
        
        public InnerClass(int innerVar) {
            this.innerVar = innerVar;
        }

        public void innerMethod() {
            System.out.println(innerVar);
        }
    }

    public static void main(String[] args) {
        // Create an instance of Outerclass
        Outerclass outerObj = new Outerclass(10);
        
        // Call outerMethod
        outerObj.outerMethod();
        
        // To call innerMethod of InnerClass from a static context
        // you need to create an instance of InnerClass as well
        InnerClass innerObj = outerObj.new InnerClass(20);
        innerObj.innerMethod();
    }
}