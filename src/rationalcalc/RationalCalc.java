package rationalcalc;
import java.util.Scanner;
public class RationalCalc {
    /*  Beginning of CONSOLE MENU */
    static int choice=-1;
    static Rational a = new Rational(1,2);
    static Rational b = new Rational(-1,4);
    static Rational c = new Rational();
    static int m,n,x,y;
    static Scanner t = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            try{
                /*  Menu    */
                choice = menu();
                switch(choice){
                    case 1:
                        System.out.println("First Rational:");
                        m = grab("Please Enter Numerator - ");
                        /* To restrict user input */
                        //if (m>=46340) throw new Calculation_Error();
                        n = grab("Please Enter Denominator (Not Zero) - ");
                        /* To restrict user input */
                        //if (n>=46340) throw new Calculation_Error();
                        if (n==0) throw new Rational_Error();
                        a = new Rational(m,n);
                        break;
                    case 2:
                        System.out.println("Second Rational:");
                        x = grab("Please Enter Numerator - ");
                        /* To restrict user input */
                        //if (x>=46340 ) throw new Calculation_Error();
                        y = grab("Please Enter Denominator (Not Zero) - ");
                        /* To restrict user input */
                        //if (y>=46340 ) throw new Calculation_Error();
                        if (y==0) throw new Rational_Error();
                        b = new Rational(x,y);
                        break;
                    case 3:
                        System.out.print("Please select an operation:\n");
                        System.out.print("1. (+)Add Rationals\n");
                        System.out.print("2. (-)Subtract Rationals\n");
                        System.out.print("3. (*)Multiply Rationals\n");
                        System.out.print("4. (/)Divide Rationals\n");
                        switch(t.nextInt()){
                            case 1:
                                printRat(a);
                                System.out.print("\t+\t");
                                printRat(b);
                                System.out.print("\t=\t");
                                c = Add(a,b);
                                c = Normal(c);
                                printRat(c);
                                System.out.print("\n");
                                printDec(a);
                                System.out.print("\t+\t");
                                printDec(b);
                                System.out.print("\t=\t");
                                printDec(c);
                                System.out.print("\n");
                                break;
                            case 2:
                                printRat(a);
                                System.out.print("\t-\t");
                                printRat(b);
                                System.out.print("\t=\t");
                                c = Subtract(a,b);
                                c = Normal(c);
                                printRat(c);
                                System.out.print("\n");
                                printDec(a);
                                System.out.print("\t-\t");
                                printDec(b);
                                System.out.print("\t=\t");
                                printDec(c);
                                System.out.print("\n");
                                break;
                            case 3:
                                printRat(a);
                                System.out.print("\t*\t");
                                printRat(b);
                                System.out.print("\t=\t");
                                c = Multiply(a,b);
                                c = Normal(c);
                                printRat(c);
                                System.out.print("\n");
                                printDec(a);
                                System.out.print("\t*\t");
                                printDec(b);
                                System.out.print("\t=\t");
                                printDec(c);
                                System.out.print("\n");
                                break;
                            case 4:
                                printRat(a);
                                System.out.print("\t/\t");
                                printRat(b);
                                System.out.print("\t=\t");
                                c = Divide(a,b);
                                c = Normal(c);
                                printRat(c);
                                System.out.print("\n");
                                printDec(a);
                                System.out.print("\t/\t");
                                printDec(b);
                                System.out.print("\t=\t");
                                printDec(c);
                                System.out.print("\n");
                                break;
                        }
                        break;
                    case 4:
                        System.out.print("Please select an equality:\n");
                        System.out.print("1. (==)Equals\n");
                        System.out.print("2. (!=)Does no Equal\n");
                        System.out.print("3. (<)Less Than\n");
                        System.out.print("4. (<=)Less Than or Equal To\n");
                        System.out.print("5. (>)Greater Than\n");
                        System.out.print("6. (>=)Greater Than or Equal To\n");
                        switch(t.nextInt()){
                            case 1:
                                printRat(a);
                                System.out.print("\t==\t");
                                printRat(b);
                                System.out.print("\t:\t");
                                System.out.print(Equals(a,b) + "\n");
                                printDec(a);
                                System.out.print("\t==\t");
                                printDec(b);
                                System.out.print("\t:\t");
                                System.out.print(Equals(a,b) + "\n");
                                break;
                            case 2:
                                printRat(a);
                                System.out.print("\t!=\t");
                                printRat(b);
                                System.out.print("\t:\t");
                                System.out.print(NotEquals(a,b) + "\n");
                                printDec(a);
                                System.out.print("\t!=\t");
                                printDec(b);
                                System.out.print("\t:\t");
                                System.out.print(NotEquals(a,b) + "\n");
                                break;
                            case 3:
                                printRat(a);
                                System.out.print("\t<\t");
                                printRat(b);
                                System.out.print("\t:\t");
                                System.out.print(LessThan(a,b) + "\n");
                                printDec(a);
                                System.out.print("\t<\t");
                                printDec(b);
                                System.out.print("\t:\t");
                                System.out.print(LessThan(a,b) + "\n");
                                break;
                            case 4:
                                printRat(a);
                                System.out.print("\t<=\t");
                                printRat(b);
                                System.out.print("\t:\t");
                                System.out.print(LessEqual(a,b) + "\n");
                                printDec(a);
                                System.out.print("\t<=\t");
                                printDec(b);
                                System.out.print("\t:\t");
                                System.out.print(LessEqual(a,b) + "\n");
                                break;
                            case 5:
                                printRat(a);
                                System.out.print("\t>\t");
                                printRat(b);
                                System.out.print("\t:\t");
                                System.out.print(GreaterThan(a,b) + "\n");
                                printDec(a);
                                System.out.print("\t>\t");
                                printDec(b);
                                System.out.print("\t:\t");
                                System.out.print(GreaterThan(a,b) + "\n");
                                break;
                            case 6:
                                printRat(a);
                                System.out.print("\t>=\t");
                                printRat(b);
                                System.out.print("\t:\t");
                                System.out.print(GreaterEqual(a,b) + "\n");
                                printDec(a);
                                System.out.print("\t>=\t");
                                printDec(b);
                                System.out.print("\t:\t");
                                System.out.print(GreaterEqual(a,b) + "\n");
                                break;
                        }
                    break;
                }
            }
            catch(Rational_Error err){
                System.out.println("Denominator cannot be zero, rational "
                        + " not created.");
            }
//            catch(Calculation_Error er){
//                System.out.println("Number too large, possible overflow. "
//                        + "Rational not created.");
//            }
        }
        while(choice!=0);
    }
    /*  End of CONSOLE MENU */
    /*  Normalizes a Rational by dividing it's numberator and denominator by 
        the greatest common divisor.    */
    static Rational Normal(Rational r){
        int a = r.getNum();
        int b = r.getDen();
        int c = gcd(a,b);
        Rational s = new Rational((a/c),(b/c));
        return s;
    }
    static Rational Add(Rational r, Rational s){
        /*  Normalize before operation if an integer is larger than 1/2
            the maximum size    */ 
        if((Math.abs(r.getNum()) >= 1073741823)) r = Normal(r);
        if((Math.abs(s.getNum()) >= 1073741823)) s = Normal(s);
        
        int a = r.getNum(),b = r.getDen(),m = s.getNum(),n = s.getDen();
        a = a * n;
        m = m * b;
        b = b * n;
        Rational t = new Rational ((a+m),b);
        /*  Return the normalized value  */
        return Normal(t);
    }
    static Rational Subtract(Rational r, Rational s){
        /*  Normalize before operation if an integer is larger than 1/2
            the maximum size    */ 
        if((Math.abs(r.getNum()) >= 1073741823)) r = Normal(r);
        if((Math.abs(s.getNum()) >= 1073741823)) s = Normal(s);

        int a = r.getNum(),b = r.getDen(),m = s.getNum(),n = s.getDen();
        a = a * n;
        m = m * b;
        b = b * n;
        Rational t = new Rational ((a-m),b);
        /*  Return the normalized value  */
        return Normal(t);
    }
    static Rational Multiply(Rational r, Rational s){
        /*  Normalize before operation if Integers larger than square root
            the maximum size    */ 
        if((Math.abs(r.getNum()) >= 46340) || (Math.abs(r.getDen()) >= 46340)){
            r = Normal(r);  
        }
        if((Math.abs(s.getNum()) >= 46340) || (Math.abs(s.getDen()) >= 46340)){
            s = Normal(s);  
        }
        int a = r.getNum(),b = r.getDen(),m = s.getNum(),n = s.getDen();
        Rational t = new Rational (a*m,b*n);
        return Normal(t);
    }
    static Rational Divide(Rational r, Rational s){
        /*  Normalize before operation if Integers larger than square root
            the maximum size    */ 
        if((Math.abs(r.getNum()) >= 46340) || (Math.abs(r.getDen()) >= 46340) || 
                (Math.abs(s.getNum()) >=46340) || 
                (Math.abs(s.getDen()) >=46340)){
            r = Normal(r);
            s = Normal(s);
        }
        int a = r.getNum(),b = r.getDen(),m = s.getNum(),n = s.getDen();
        Rational t = new Rational (a*n,b*m);
        return Normal(t);
    }
    static int gcd(int m, int n){
        int x;
        while((m%n)!= 0){
            x = m%n;
            m = n;
            n = x;
        }
        if((m%n)==0) return n;
        else {
            return 1337;
        }
    }
    static Boolean Equals(Rational r, Rational s){
        /*  Normalize before operation if Integers (to be multiplied in 
            evaluation) are both larger than square root of
            the maximum size of Integer   */ 
        if((Math.abs(r.getNum()) >= 46340) || (Math.abs(r.getDen()) >= 46340)){
            r = Normal(r);  
        }
        if((Math.abs(s.getNum()) >= 46340) || (Math.abs(s.getDen()) >= 46340)){
            s = Normal(s);  
        }
        return ((r.getNum()*s.getDen())==(r.getDen()*s.getNum()));
    }
    static Boolean NotEquals(Rational r, Rational s){
        return !(Equals(r,s));
    }
    static Boolean LessThan(Rational r, Rational s){
        /*  Normalize before operation if Integers (to be multiplied in 
            evaluation) are both larger than square root of
            the maximum size of Integer   */ 
        if((Math.abs(r.getNum()) >= 46340) || (Math.abs(r.getDen()) >= 46340)){
            r = Normal(r);  
        }
        if((Math.abs(s.getNum()) >= 46340) || (Math.abs(s.getDen()) >= 46340)){
            s = Normal(s);  
        }
        return ((r.getNum()*s.getDen())<(r.getDen()*s.getNum()));
    }
    static Boolean LessEqual(Rational r, Rational s){
        return ( LessThan(r,s) || Equals(r,s));
    }
    static Boolean GreaterThan(Rational r, Rational s){
        /*  Normalize before operation if Integers (to be multiplied in 
            evaluation) are both larger than square root of
            the maximum size of Integer   */ 
        if((Math.abs(r.getNum()) >= 46340) || (Math.abs(r.getDen()) >= 46340)){
            r = Normal(r);  
        }
        if((Math.abs(s.getNum()) >= 46340) || (Math.abs(s.getDen()) >= 46340)){
            s = Normal(s);  
        }
        return ((r.getNum()*s.getDen())>(r.getDen()*s.getNum()));
    }
    static Boolean GreaterEqual(Rational r, Rational s){
        return ( GreaterThan(r,s) || Equals(r,s));
    }
    static void printRat(Rational r){
        System.out.print(r.getNum() + "/" + r.getDen());
    }
    static void printDec(Rational r){
        System.out.printf("%1$.2f", ((double)r.getNum() /
                (double)r.getDen()));
    }
    static private int menu() {
        System.out.print("1. Enter First Rational\n");
        System.out.print("2. Enter Second Rational\n");
        System.out.print("3. Arithmetic Operations\n");
        System.out.print("4. Equality Testing\n");
        System.out.print("0. Quit\n");
        return t.nextInt();
	}
    static private int grab(String msg) {
		System.out.print(msg);
		return t.nextInt();
	}
}