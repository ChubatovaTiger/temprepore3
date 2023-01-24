package Proj8

import Proj8.buildTypes.*
import Proj8.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj8")
    name = "proj8"

    vcsRoot(Proj8_Root8)

    buildType(Proj8_Build8)
})
