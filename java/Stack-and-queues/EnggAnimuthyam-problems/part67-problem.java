import java.util.*;
class Main {
    public static void main(String[] args) {
      String[] name ={"Vignesh","Dinesh","Vinay","bujji"};
      int[] runs ={100,80,70,60};
      String[] nickName={"Viggy","dinny","vinny","buuu"};
      
      Stack<Cricketer> st = new Stack<>();
    for(int i=0;i<name.length;i++){
       st.push(new Cricketer(name[i],runs[i],nickName[i]));
       
    }
    for(Cricketer temp : st){
        System.out.println(temp.name);
    }
    }
}
class Cricketer{
    String name;
    int runs;
    String nickName;
    Cricketer(String name,int runs,String nickName){
        this.name = name;
        this.runs = runs;
        this.nickName = nickName;
    }
}
