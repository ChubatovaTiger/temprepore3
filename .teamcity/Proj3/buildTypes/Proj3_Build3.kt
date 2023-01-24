package Proj3.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj3_Build3 : BuildType({
    name = "build3"

    vcs {
        root(Proj3.vcsRoots.Proj3_Root3)
    }
})
