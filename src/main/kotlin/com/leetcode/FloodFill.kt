package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class FloodFill {

    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        floodFillWithInitialColor(image, sr, sc, image[sr][sc], newColor)

        return image
    }

    private fun floodFillWithInitialColor(image: Array<IntArray>, sr: Int, sc: Int, initialColor: Int, newColor: Int) {
        if (initialColor == newColor || currentColorNotEqualInitial(image, sr, sc, initialColor)) {
            return
        }

        image[sr][sc] = newColor

        floodFillWithInitialColor(image, sr + 1, sc, initialColor, newColor)
        floodFillWithInitialColor(image, sr, sc + 1, initialColor, newColor)
        floodFillWithInitialColor(image, sr - 1, sc, initialColor, newColor)
        floodFillWithInitialColor(image, sr, sc - 1, initialColor, newColor)
    }

    private fun currentColorNotEqualInitial(image: Array<IntArray>, sr: Int, sc: Int, initialColor: Int) =
        sr !in image.indices ||
                sc !in image[sr].indices ||
                image[sr][sc] != initialColor
}