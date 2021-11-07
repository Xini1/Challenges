package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class FirstBadVersion {

    fun execute(n: Int, bad: Int) = VersionControl(bad).firstBadVersion(n)
}

class VersionControl(private val bad: Int) {

    private fun isBadVersion(version: Int) = version >= bad

    fun firstBadVersion(n: Int): Int {
        return binarySearch(1..n)
    }

    private fun binarySearch(versions: IntRange): Int {
        if ((versions.last - versions.first + 1) in 1..2) {
            return if (isBadVersion(versions.first)) {
                versions.first
            } else {
                versions.last
            }
        }

        val middleVersion = ((versions.first.toBigInteger() + versions.last.toBigInteger()) / 2.toBigInteger()).toInt()

        return if (isBadVersion(middleVersion)) {
            binarySearch(versions.first..middleVersion)
        } else {
            binarySearch((middleVersion + 1)..versions.last)
        }
    }
}