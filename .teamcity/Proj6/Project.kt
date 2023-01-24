package Proj6

import Proj6.buildTypes.*
import Proj6.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj6")
    name = "proj6"

    vcsRoot(Proj6_Root6)

    buildType(Proj6_Build6)
})
