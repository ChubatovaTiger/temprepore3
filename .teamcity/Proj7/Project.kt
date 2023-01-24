package Proj7

import Proj7.buildTypes.*
import Proj7.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj7")
    name = "proj7"

    vcsRoot(Proj7_Root7)

    buildType(Proj7_Build7)
})
