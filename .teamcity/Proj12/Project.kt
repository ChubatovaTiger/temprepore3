package Proj12

import Proj12.buildTypes.*
import Proj12.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj12")
    name = "proj12"

    vcsRoot(Proj12_Root12)

    buildType(Proj12_Build12)
})
