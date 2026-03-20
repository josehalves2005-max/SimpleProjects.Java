package Student_Class;

public class Student {

public String name;
public double first;
public double second;
public double third;

public double grade(){
    return first + second + third;
}

public double missing(){
    return 60 - (first + second + third);
}    
        
}



    

