package com.example.calc

class CalcUtil {
    companion object{
        fun addition(a: Int, b: Int): Int{
            return a + b
        }
        fun subtract(a: Int, b: Int): Int{
            return  a - b
        }
        fun divide(a: Int, b: Int): Float{
            if( b == 0){
                throw IllegalAccessException("Divide by zero")
            } else {
                return a.toFloat() / b
            }
        }

        fun multiply(a: Int, b: Int): Int{
            return a * b
        }
    }
}