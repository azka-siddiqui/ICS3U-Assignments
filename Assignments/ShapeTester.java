/*
 * in directory this file would be called ShapeTester and not rectangle
 * When this program runs it will create two files for the class
 */

class ShapeTester {
    public static void main(String [] args){
        Rectangle rectA = new Rectangle(2,4);
        Rectangle rectB = new Rectangle(8,16);
    }
}

class Rectangle {//open Rectangle class

    //outside of constructors and methods an object is instantiated and accessible to all constructors, methods or blocks in the class
    int length; // instance variable, every time you create an object, this variable belongs to that object
    int width; // because its a class variable, its not inside a static method and has a default value of 0

    public Rectangle(int l, int w){//class constructor, consturctors have the same name as the class

        length = l;//does not have brackets around it, length is an attribute, not a method
        width = w;

        //if you do not create a constructor it automatically assigns a blank one: Rectangle(){}

    }    //end class constructor
}//close rectangle class

