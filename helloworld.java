class Welcome {
  
  public void userGreetings(){
  System.out.println("Welcome to java programming");
  }
  
  public int sum(int a,int b){
        int c = a + b;
        return c;
  }
  
}

class HelloWorld{
  public static void main(String ar]){
 
  Welcome wc = new Welcome();
  
  wc.userGreeting();
  
  int result = sum(10,20);
  System.out.println(result);
  }
}
