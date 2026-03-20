package Java_Class;

public class Rectangle {

public double widht;
public double height;

public double Area(){
    return height * widht;}

public double Perimeter(){
    return (height * 2) + (widht * 2); 
}

public double Diagonal(){
    this.height = Math.pow(height, 2);
    this.widht = Math.pow(widht, 2);
    
    return Math.sqrt(height + widht);
    
}



    
}
