package Proj5

import Proj5.buildTypes.*
import Proj5.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj5")
    name = "proj5"

    vcsRoot(Proj5_Root5)

    buildType(Proj5_Build5)
})
