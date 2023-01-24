package Proj13

import Proj13.buildTypes.*
import Proj13.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj13")
    name = "proj13"

    vcsRoot(Proj13_Root13)

    buildType(Proj13_Build13)
})
