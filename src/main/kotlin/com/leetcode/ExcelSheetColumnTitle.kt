package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class ExcelSheetColumnTitle {

    fun convertToTitle(columnNumber: Int): String {
        if (columnNumber == 0) {
            return ""
        }

        val totalLetters = 'Z' - 'A' + 1
        val columnNumberDecremented = columnNumber - 1

        return convertToTitle(columnNumberDecremented / totalLetters) +
                ('A'.code + columnNumberDecremented % totalLetters).toChar()
    }
}