class codeAlongMay23 {
    public static void main (String [] args){

        Rectangle rectA = new Rectangle(3,5);
        System.out.println(rectA.width);
        System.out.println(rectA.area());
        System.out.println("Your rectangle is square: "+rectA.isSquare());
    
    }
}
    class Rectangle{
        
    //instance variables
    int length;
    int width;

    //constructor
    Rectangle(int l, int w){//different variables from the ones above, only exist within this code block

        length = l;//only referencing the length above 
        width = w;//only referencing the width above
    
     }

     //method that returns the area
     //in order to use this method, I have to create an object
     public int area (){

        return length*width;

     }

     public boolean isSquare(){

        return length==width;

     }
    
    }