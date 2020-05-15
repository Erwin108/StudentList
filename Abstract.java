//abstract parent class

abstract class People{
    //abstract method
    public abstract void address();
    }
    //Male class extends People class
    class Academic extends People{

    public void address(){
        System.out.println("valid Person.");

    }
    public static void main(String args[]){
        People obj = new Academic();
        obj.address();
    }
}
