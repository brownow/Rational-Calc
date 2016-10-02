package rationalcalc;
public class Rational { 
    private int num;
    private int den;
    public Rational(){   
    }
    public Rational(int numerator, int denominator){
        try{
            this.num = numerator;
            this.den = denominator;
            /*  Ensure numerator carries the negative sign
                or that if both num and den are negative make
                rational positive   */
            if (this.den < 0){
                this.den = this.den * (-1);
                this.num = this.num * (-1);
            }
            if (this.den == 0){
                throw new Rational_Error();
            }
        }
        catch (Rational_Error err){
            err.msg = "Cannot have zero in the denominator!";
            System.out.print(err.msg);
        }
    }
    int getNum(){
        return num;
    }
    int getDen(){
        return den;
    }
}