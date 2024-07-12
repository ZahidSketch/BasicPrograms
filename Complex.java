class ComplexNumber {

    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {

        this.real = real;
        this.imaginary = imaginary;
    }

    public void show() {
        System.out.println(real + " + i" + imaginary);
    }


        ComplexNumber add(ComplexNumber a, ComplexNumber b) {

        ComplexNumber res = new ComplexNumber(0, 0);

        res.real = a.real + b.real;
        res.imaginary = a.imaginary + b.imaginary;

        return res;
    }
}
public class Complex {

    public static void main(String[] args){

        ComplexNumber c1 = new ComplexNumber(3.0, 4.0);
        ComplexNumber c2 = new ComplexNumber(5.0, 6.0);

        c1.show();
        c2.show();

        ComplexNumber ans = c1.add(c1, c2);
        ans.show();
    }
}
