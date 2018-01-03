package Dog;
public class Dog{
   String name;
   int age;
   String colour;
   
   public Dog(){ 
	   System.out.println("一只帅气的汪");
   }
   
   public Dog(String name){
	   this.name=name;
	   
   System.out.println("名字："+name);
   }
   
   public Dog(String name,int age){
	   this.name=name;
	   this.age=age;
	 
	   System.out.println("年龄："+age);
	   
	   
   }
   public Dog(String name,int age,String colour){
	   this.name=name;
	   this.age=age;
	   this.colour=colour;
	   
	   System.out.println("毛色："+colour);
   }
}

