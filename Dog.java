package Dog;
public class Dog{
   String name;
   int age;
   String colour;
   
   public Dog(){ 
	   System.out.println("һֻ˧������");
   }
   
   public Dog(String name){
	   this.name=name;
	   
   System.out.println("���֣�"+name);
   }
   
   public Dog(String name,int age){
	   this.name=name;
	   this.age=age;
	 
	   System.out.println("���䣺"+age);
	   
	   
   }
   public Dog(String name,int age,String colour){
	   this.name=name;
	   this.age=age;
	   this.colour=colour;
	   
	   System.out.println("ëɫ��"+colour);
   }
}

