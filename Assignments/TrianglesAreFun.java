/*
 * create a triangle class and calculate area and perimeter in a method
 * tell if it is equilateral or isosceles triangle
 */

class TrianglesAreFun {
    public static void main(String[]args){

        Triangle blob = new Triangle(4, 7, 4, 6, 8);

        System.out.println("The base length of the triangle: "+blob.base);
        System.out.println("The height of the triangle: "+blob.height);
        System.out.println("The area of the triangle is: "+blob.area());
        System.out.println("The triangle is equilateral: "+blob.isEquilateral());
        
    }

}

class Triangle{

    //instance variables
    int base;
    int height;
    int side1;
    int side2;
    int side3;

    Triangle (int b, int h, int c, int d, int e){

        base = b;
        height = h;
        side1 = c;
        side2 = d;
        side3 = e;
    
    }

        public int area (){

            return (base*height)/2;
    
        }
    
        public boolean isEquilateral(){
    
            return side1==side2 && side2==3;
    
        }
        
}