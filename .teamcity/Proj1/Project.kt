package Proj1

import Proj1.buildTypes.*
import Proj1.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj1")
    name = "proj1"

    vcsRoot(Proj1_Root1)

    buildType(Proj1_Build1)
})
