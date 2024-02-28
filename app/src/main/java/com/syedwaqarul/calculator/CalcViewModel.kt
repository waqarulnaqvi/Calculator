package com.syedwaqarul.calculator
//In view model almost every thing is private
import android.text.method.TextKeyListener.clear
import androidx.lifecycle.ViewModel
import com.syedwaqarul.calculator.ui.theme.CalculatorScreen.CalculatorEvent
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class UiState(
    val num1:String="",
    val num2:String="",
   val ans:String=""
)
//All logic of the class is put here
class CalcViewModel:ViewModel() {
    //flow is a stream in java
//    setup ui state flow
//    handle events from user
//    flow is mutable because it is changeable

// step 1:setup ui state flow
    private val _uiState= MutableStateFlow(UiState())//underscore means it is internally used object
    var uiState:StateFlow<UiState> =_uiState.asStateFlow()//It is externally used

// step 2:  handles events from user
    fun onEvent(event: CalculatorEvent)
    {
        when(event)
        {
            CalculatorEvent.Add -> add()
            CalculatorEvent.Clear -> clear()
            CalculatorEvent.Div -> division()
            CalculatorEvent.Multiply -> multiplication()
            is CalculatorEvent.Num1 -> {
                _uiState.update { it.copy(num1 = event.value) }//everything is same except the value of num1
            }
            is CalculatorEvent.Num2 -> {
                _uiState.update { it.copy(num2 = event.value) }//everything is same except the value of num2

            }
            CalculatorEvent.Sub -> Substraction()
        }
    }

//    step 3: create functions to handle events
    private fun Substraction() {
        TODO("Not yet implemented")
    }

    private fun multiplication() {
        TODO("Not yet implemented")
    }

    private fun division() {
        TODO("Not yet implemented")
    }

    private fun add() {
        TODO("Not yet implemented")
    }
    private fun clear() {
        TODO("Not yet implemented")
    }
}