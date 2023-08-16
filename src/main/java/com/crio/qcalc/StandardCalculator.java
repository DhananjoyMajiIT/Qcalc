package com.crio.qcalc;

public class StandardCalculator {
    protected double result;
    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }
    
    //    public void add(double num1, double num2){

    //     result = num1 + num2;
    
    //    }
        
        public final void add(double num1, double num2){

            double result = num1 + num2;

            if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){

                throw new ArithmeticException("Double overflow");

            }

            this.result = result;

        }


        // public void subtract(double num1, double num2){
        //     result= num1-num2;
        // }
        
        public void subtract(double num1, double num2){

            double result = num1 - num2;

            if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){

                throw new ArithmeticException("Double overflow");

            }

            this.result = result;

        }

        
        public  void multiply(double num1, double num2){

           
            if((num1 == 0) || num2==0 || (num1 ==Double.MAX_VALUE  || num2 == Double.MAX_VALUE) || (num1 ==-Double.MAX_VALUE  || num2 == Double.MAX_VALUE)|| (num1 ==-Double.MAX_VALUE  || num2 == Double.MAX_VALUE)){

                throw new ArithmeticException("Double overflow");

            }
            result = num1 * num2;
        }

    
        // public void multiply(double num1, double num2){
        //     result= num1*num2;
        // }
    
    
        
        public final void divide(double num1, double num2){

            if(num2 == 0.0){

                throw new ArithmeticException("Divide By Zero");

            }

            result = num1 / num2;

        }


        
        public double getResult() {

            return result;

        }
        
        public void setResult(double value) {

            if (value != 0)
                return;
            this.result = value;

        }
        
        public void clearResult() {

            result = 0;

        }
        
        public void printResult(){

            System.out.println("Standard Calculator Result:"+ result);

        }

}

    
   
    

    
   






