package Proj9

import Proj9.buildTypes.*
import Proj9.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj9")
    name = "proj9"

    vcsRoot(Proj9_Root9)

    buildType(Proj9_Build9)
})
