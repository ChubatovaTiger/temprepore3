package Proj12.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj12_Build12 : BuildType({
    name = "build12"

    vcs {
        root(Proj12.vcsRoots.Proj12_Root12)
    }
})
