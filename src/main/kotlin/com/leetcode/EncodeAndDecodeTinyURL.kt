package com.leetcode

import java.util.*

class EncodeAndDecodeTinyURL {

    fun execute(url: String): String {
        val codec = Codec()
        return codec.decode(codec.encode(url))
    }
}

class Codec {

    private val map = mutableMapOf<String, String>()

    fun encode(longUrl: String): String {
        val shortUrl = shortUrl()
        map[shortUrl] = longUrl
        return shortUrl
    }

    fun decode(shortUrl: String): String {
        return map[shortUrl] ?: ""
    }

    private fun shortUrl(): String {
        var shortUrl: String
        do {
            shortUrl = UUID.randomUUID().toString().substringBefore('-')
        } while (map.containsKey(shortUrl))
        return shortUrl
    }
}