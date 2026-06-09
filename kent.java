public class kent {
    String st;
    kent(){
        System.out.println("This is a without parameter constructor");
    }
     kent(String str){
         st=str;
        System.out.println("Welcome "+st);
    }
    kent(kent k2){
        st=k2.st;
        System.out.println("Welcome "+st);
    }
    public void get(){
        System.out.println("This is get method in kent class");
    }
    public static void main(String[] args) {
        kent k1=new kent();
        kent k2=new kent("Tarun");
        kent k3=new kent(k2);
        k1.get();
// constriuctor gets called automatically as soon as you create object
    }
}
