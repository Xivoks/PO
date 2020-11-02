package pl.imiajd.brunow;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    public double getPerimeter(){
        return this.height*2+this.width*2;
    }
    public double getArea(){
        return this.height*this.width;
    }

}
