package Proj3

import Proj3.buildTypes.*
import Proj3.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj3")
    name = "proj3"

    vcsRoot(Proj3_Root3)

    buildType(Proj3_Build3)
})
