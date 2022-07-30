package PillarsOfJava;

public class classAndObjects 
{  
    String name; 
    int age; 
    String color; 
    public classAndObjects(String name, int age, String color) 
    { 
        this.name = name; 
         
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() {
    return color; 
} 
@Override
public String toString() 
{ 
    return("Hi my name is "+ this.getName()+ ".\n age and color are  " + this.getAge()+ " and "+ this.getColor() + "."); } 
public static void main(String[] args) 
{ 
    classAndObjects scott = new classAndObjects("lucky", 25, "white"); 
    System.out.println(scott.toString()); 
}
} 

