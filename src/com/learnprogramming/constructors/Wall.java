package com.learnprogramming.constructors;

public class Wall {
    private double height;
    private double width;
    
    public Wall(double width, double height){
        if(width<0) {
            this.width = 0;
        }else{
            this.width = width;
        }

        if(height<0) {
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double w){
        if(w<0) {
            this.width = 0;
        }else{
            this.width = w;
        }
    }

    public void setHeight(double h){
        if(h<0) {
            this.height = 0;
        }else{
            this.height = h;
        }
    }

    public double getArea(){
        return height*width;
    }
}
