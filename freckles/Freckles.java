/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freckles;

/**
 *
 * @author jenni
 */
public class Freckles {
 private int x,y; //the x and y coordinate of the point
    //private is called the access modifier
    /**
     * 
     * @param x1 as the x coordinate
     * @param y1 as the y coordinate
     */
    //the constructor for the Point object
    public Freckles (int x1,int y1){
        x = x1;
        y = y1;
 
    }
    //an object can have multiple constructors
    
    public Freckles(){
        x = 0;
        y = 0;
    }
    //set method
    //get method
    
    //mutator
    public void setX(int x1){
        x = x1;
    }
    public void setY(int y1){
        y = y1;
    }
    //access
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    /**
     * 
     * @return the object's attributes
     */
    public String toString(){
        return x + " " + y;
    }
    //finding the distance between two points
    /**
     * 
     * @param P as a point object
     * @return the distance between Point P and this point
     */
    public double distance(Point P){
        double xdiff = P.x-this.x;
        double ydiff = P.y-this.y;
        return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
