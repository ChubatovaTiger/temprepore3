package Proj4

import Proj4.buildTypes.*
import Proj4.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj4")
    name = "proj4"

    vcsRoot(Proj4_Root4)

    buildType(Proj4_Build4)
})
