package assignment3_1;//package name
import java.util.Scanner;

class VarScope{
	public static int classVar=10;//declare class variable with static keyword
	public int insVar=100;//declare instance variable
	
	//Getter and setter method of class variable and instance variable
	public static int getClassVar() {
		return classVar;
	}
	public static void setClassVar(int classVar) {
		VarScope.classVar = classVar;
	}
	public int getInsVar() {
		return insVar;
	}
	public void setInsVar(int insVar) {
		this.insVar = insVar;
	}

}

public class Assignment3_1 {//class name
	@SuppressWarnings("static-access")
	public static void main(String args[]){//main method
		Scanner inp=new Scanner(System.in);
			
		VarScope v1= new VarScope();//instantiate class object
		VarScope v2=new VarScope();//instantiate class object
		System.out.println("Enter value for instance variable of first object");
		v1.setInsVar(inp.nextInt());//set instance variable value on first object
		System.out.println("Enter value for class variable");
		VarScope.setClassVar(inp.nextInt());//set class variable value
		System.out.println("Enter value for instance variable of second object");
		v2.setInsVar(inp.nextInt());//set instance variable value on second object
		System.out.println("Enter value for class variable of second object");
		v2.setClassVar(inp.nextInt());//set class variable value
		System.out.println("Printing the values to show the scope ");
		System.out.println("Instance Varible on first object :"+v1.getInsVar());
		System.out.println("Class Varibale on first object :"+v1.getClassVar());
		System.out.println("Instance Varible on second object :"+v2.getInsVar());
		System.out.println("Class Varibale on second object :"+v2.getClassVar());
		
		inp.close();//close scanner object
		
		
		
		
		
		
	}//close main

}//close class
