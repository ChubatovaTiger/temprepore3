package Proj14.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj14_Build14 : BuildType({
    name = "build14"

    vcs {
        root(Proj14.vcsRoots.Proj14_Root14)
    }
})
