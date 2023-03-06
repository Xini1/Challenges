package com.leetcode

class DefangingAnIPAddress {

    fun defangIPaddr(address: String): String {
        return address.replace(".", "[.]")
    }
}