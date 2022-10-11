package com.leetcode

class LicenseKeyFormatting {

    fun licenseKeyFormatting(s: String, k: Int): String {
        return s.replace("-", "")
            .uppercase()
            .reversed()
            .windowedSequence(k, k, true)
            .joinToString("-")
            .reversed()
    }
}