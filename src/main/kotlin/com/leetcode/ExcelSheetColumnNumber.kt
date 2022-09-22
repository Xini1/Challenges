package com.leetcode

class ExcelSheetColumnNumber {

    fun titleToNumber(columnTitle: String): Int {
        if (columnTitle.length == 1) {
            return charToNumber(columnTitle.first())
        }
        return titleToNumber(columnTitle.substring(0 until columnTitle.length - 1)) * 26 +
                charToNumber(columnTitle.last())
    }

    private fun charToNumber(char: Char) = char - 'A' + 1
}