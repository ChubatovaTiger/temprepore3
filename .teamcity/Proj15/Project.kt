package Proj15

import Proj15.buildTypes.*
import Proj15.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("Proj15")
    name = "proj15"

    vcsRoot(Proj15_Root15)

    buildType(Proj15_Build15)
})
