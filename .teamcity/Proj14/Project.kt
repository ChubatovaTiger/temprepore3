package Proj14

import Proj14.buildTypes.*
import Proj14.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj14")
    name = "proj14"

    vcsRoot(Proj14_Root14)

    buildType(Proj14_Build14)
})
