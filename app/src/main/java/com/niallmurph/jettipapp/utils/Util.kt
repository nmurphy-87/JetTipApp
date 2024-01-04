package com.niallmurph.jettipapp.utils


fun calculateTotalTip(
    totalBill: Double,
    tipPercentage: Int
): Double {
    return if (totalBill > 0 && totalBill.toString()
            .isNotEmpty()
    ) (totalBill * tipPercentage) / 100 else 0.0
}

fun calculateTotalPerPerson(
    totalBill: Double,
    splitBy: Int,
    tipPercentage: Int
): Double {
    val bill = calculateTotalTip(totalBill = totalBill, tipPercentage = tipPercentage) + totalBill
    return (bill / splitBy)
}