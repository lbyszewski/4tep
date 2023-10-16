package olsztyn.zseit.com.basic;

public class First {

    // property with access

    public String firsName;

    public First(String firsName) {
        this.firsName = firsName;
    }


    public int addTwoNumbersa(int a, int b){
        int result = a + b;
        return  result;
    }

    public void show(int a,int b){
        System.out.println(this.addTwoNumbersa(a,b));
    }

    // constructor


}
