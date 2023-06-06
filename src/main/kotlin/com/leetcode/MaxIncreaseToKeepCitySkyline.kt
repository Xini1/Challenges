package com.leetcode

class MaxIncreaseToKeepCitySkyline {

    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        return City.from(grid).maxIncreaseKeepingSkyline()
    }
}

class City(private val buildings: Collection<Building>) {

    companion object {
        fun from(grid: Array<IntArray>): City {
            return grid.asSequence()
                .flatMapIndexed { y, line ->
                    line.asSequence()
                        .mapIndexed { x, height -> Building(Coordinates(x, y), height) }
                }
                .toList()
                .let(::City)
        }
    }

    fun maxIncreaseKeepingSkyline(): Int {
        return buildings.asSequence()
            .map {
                it.heightDifference(
                    minOf(buildingsInSameColumn(it).max(), buildingsInSameRow(it).max())
                )
            }
            .sum()
    }

    private fun buildingsInSameRow(building: Building): Collection<Building> {
        return buildings.filter { it.isInSameRow(building) }
    }

    private fun buildingsInSameColumn(building: Building): Collection<Building> {
        return buildings.filter { it.isInSameColumn(building) }
    }
}

class Building(private val coordinates: Coordinates, private val height: Int) : Comparable<Building> {

    fun isInSameRow(building: Building) = coordinates.row == building.coordinates.row

    fun isInSameColumn(building: Building) = coordinates.column == building.coordinates.column

    fun heightDifference(building: Building): Int {
        return building.height - height
    }

    override fun compareTo(other: Building): Int {
        return height.compareTo(other.height)
    }
}

data class Coordinates(val column: Int, val row: Int)