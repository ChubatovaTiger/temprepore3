package Proj10

import Proj10.buildTypes.*
import Proj10.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj10")
    name = "proj10"

    vcsRoot(Proj10_Root10)

    buildType(Proj10_Build10)
})
