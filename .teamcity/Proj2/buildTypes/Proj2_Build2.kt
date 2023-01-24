package Proj2.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj2_Build2 : BuildType({
    name = "build2"

    vcs {
        root(Proj2.vcsRoots.Proj2_Root2)
    }
})
