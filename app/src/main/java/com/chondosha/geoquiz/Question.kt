package com.chondosha.geoquiz

import androidx.annotation.StringRes

// data class to represent a question and answer for quiz
data class Question(@StringRes val textResId: Int, val answer: Boolean)