package com.leetcode

class MinimumAmountOfTimeToCollectGarbage {

    fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
        val pickupPoint = PickupPoint.from(garbage, travel)
        return Garbage.values()
            .asSequence()
            .map(::Truck)
            .map { it.travelTime(pickupPoint) }
            .sum()
    }

    fun memoryEfficientGarbageCollection(garbage: Array<String>, travel: IntArray): Int {
        var travelTime = 0
        for (garbageType in listOf('M', 'P', 'G')) {
            for (index in garbage.indices) {
                travelTime += garbage[index].count { it == garbageType }
                if (index == garbage.lastIndex || hasNotGarbageToCollect(garbage, index + 1, garbageType)) {
                    break
                }
                travelTime += travel[index]
            }
        }
        return travelTime
    }

    private fun hasNotGarbageToCollect(garbage: Array<String>, start: Int, garbageType: Char): Boolean {
        for (i in start..garbage.lastIndex) {
            if (garbage[i].contains(garbageType)) {
                return false
            }
        }
        return true
    }
}

class Truck(private val garbage: Garbage) {

    fun travelTime(first: PickupPoint): Int {
        var pickupPoint = first
        var travelTime = 0
        do {
            travelTime += pickupPoint.travelTime + pickupPoint.collectingTime(garbage)
            if (pickupPoint.next == null) {
                break
            }
            pickupPoint = pickupPoint.next!!
        } while (pickupPoint.hasGarbageDownTheRoad(garbage))
        return travelTime
    }
}

data class PickupPoint(private val house: House, val next: PickupPoint?, val travelTime: Int) {

    companion object {
        fun from(garbage: Array<String>, travel: IntArray): PickupPoint {
            return PickupPoint(
                House.from(garbage[0]),
                pickupPoint(garbage.sliceArray(1 until garbage.size), travel),
                0
            )
        }

        private fun pickupPoint(garbage: Array<String>, travel: IntArray): PickupPoint? {
            if (garbage.isEmpty()) {
                return null
            }
            return PickupPoint(
                House.from(garbage[0]),
                pickupPoint(
                    garbage.sliceArray(1 until garbage.size),
                    travel.sliceArray(1 until travel.size)
                ),
                if (travel.isEmpty()) 0 else travel[0]
            )
        }
    }

    fun hasGarbageDownTheRoad(garbage: Garbage): Boolean {
        return house.hasGarbage(garbage) || (next?.hasGarbageDownTheRoad(garbage) ?: false)
    }

    fun collectingTime(garbage: Garbage): Int {
        return house.collectingTime(garbage)
    }
}

data class House(private val garbageToCollect: Collection<Garbage>) {

    companion object {

        fun from(garbage: String): House {
            return garbage.asSequence()
                .map { Garbage.from(it) }
                .toList()
                .let(::House)
        }
    }

    fun hasGarbage(garbage: Garbage): Boolean {
        return garbage in garbageToCollect
    }

    fun collectingTime(garbage: Garbage): Int {
        return garbageToCollect.count { it == garbage }
    }
}

enum class Garbage {
    METAL, PAPER, GLASS;

    companion object {

        fun from(char: Char): Garbage {
            return when (char) {
                'M' -> METAL
                'P' -> PAPER
                else -> GLASS
            }
        }
    }
}