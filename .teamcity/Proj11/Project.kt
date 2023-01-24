package Proj11

import Proj11.buildTypes.*
import Proj11.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj11")
    name = "proj11"

    vcsRoot(Proj11_Root11)

    buildType(Proj11_Build11)
})
