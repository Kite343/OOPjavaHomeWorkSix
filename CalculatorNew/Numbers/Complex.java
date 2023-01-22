package CalculatorNew.Numbers;

public class Complex {
    double real; 
	double image;

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;        
    }

    public Complex(double real) {
        this.real = real;
        this.image = 0;        
    }
    
    public Complex() {
        this.real = 0;
        this.image = 0;        
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    @Override
    public String toString() {
        if(image < 0){
            return real + "" + image + "i";
        }
        else if(image == 0){
            return real + "";
        }
        return real + "+" + image + "i";
    }   
    
}
