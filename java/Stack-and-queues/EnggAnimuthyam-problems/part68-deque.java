import java.util.*;
class Main {
    public static void main(String[] args) {
        String[] name ={"vignesh","arjun","krish","ram"};
        int[] age ={20,21,22,23,24};
        String[] flag ={"yellow","orange","green","red"};
        
       Deque<student> dq = new LinkedList<>();
       for(int i=0;i<name.length;i++){
           dq.addLast(new student(name[i],age[i],flag[i]));
       }
       while(!dq.isEmpty()){
           student front = dq.pollFirst();
           System.out.println(front.name);
           
           if(!dq.isEmpty()){
               student last = dq.pollLast();
               System.out.println(last.name);
           }
       }
     
    }
}
class student{
    String name;
    int age;
    String flag;
    student(String name,int age,String flag){
        this.name =name;
        this.age=age;
        this.flag =flag;
    }
}

