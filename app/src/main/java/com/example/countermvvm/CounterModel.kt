package com.example.countermvvm

class CounterModel(
    var count: Int = 0
) {
    fun getCurrentValue(): Int {
        return count
    }

    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }
}