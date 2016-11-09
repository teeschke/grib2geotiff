package com.meteogroup.application.grib2geotiff

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.junit.JUnitSpekRunner
import org.junit.internal.runners.JUnit4ClassRunner
import org.junit.runner.RunWith
import kotlin.test.assertEquals

@RunWith(JUnitSpekRunner::class)
class Grib2GeotiffTest : Spek({

    describe("a calculator") {
        val g2g = Grib2Geotiff()

        it("2 + 2 = 6") {
            val sum = g2g.add(2, 2)
            assertEquals(4, sum)
        }

        it("4 + -6 = -2") {
            val subtract = g2g.add(4, -6)
            assertEquals(-2, subtract)
        }

    }

})
