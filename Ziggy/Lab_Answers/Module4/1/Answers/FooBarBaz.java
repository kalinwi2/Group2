public class FooBarBaz {

public static void main(String[] args) {
      // TODO Auto-generated method stub
      for(int x=1;x<=50;x++){
         System.out.print(x + " ");
         if(x%3==0){
            System.out.print("foo ");
         }
         if(x%5==0){
            System.out.print("bar ");
         }
         if(x%7==0){
            System.out.print("baz ");
         }
         System.out.println("");
      }
   }

}
