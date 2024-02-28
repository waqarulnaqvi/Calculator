package com.syedwaqarul.calculator.ui.theme.CalculatorScreen

sealed class CalculatorEvent {//No constructor can be created it is an static class
    data object Add:CalculatorEvent()//It behaves like an object
    data object Sub:CalculatorEvent()
    data object Div:CalculatorEvent()
    data object Multiply:CalculatorEvent()
    data object Clear:CalculatorEvent()
    data class Num1(val value: String):CalculatorEvent()
    data class Num2(val value: String):CalculatorEvent()
//   data clas is a special type of class that is used to handle the data.
}

//alt+shift+cursor click shortcut -Multiple cursor