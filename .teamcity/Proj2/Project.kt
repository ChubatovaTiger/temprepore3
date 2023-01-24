package Proj2

import Proj2.buildTypes.*
import Proj2.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj2")
    name = "proj2"

    vcsRoot(Proj2_Root2)

    buildType(Proj2_Build2)
})
