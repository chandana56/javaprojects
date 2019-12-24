package sample2;

public class myclass {
public static void main(String args[])
{
	student chandu = new student();//chandu is object or instance//
	
	chandu.id = 5;
	chandu.name = "chandu";
	chandu.age = 25;
	chandu.gender = "female";
	 
	System.out.println(chandu.id +" is"+ chandu.name + " is " + chandu.age);
}

}
