package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class KthSymbolInGrammar {

    /*
               0
              /  \
             0    1
           /  \  /  \
          0   1  1   0
     */
    fun kthGrammar(n: Int, k: Int): Int {
        if (k == 1) {
            return 0
        }

        return if (k % 2 == 0) {
            if (kthGrammar(n - 1, k / 2) == 0) {
                1
            } else {
                0
            }
        } else {
            if (kthGrammar(n - 1, (k + 1) / 2) == 0) {
                0
            } else {
                1
            }
        }
    }
}