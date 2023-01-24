package Proj13.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj13_Build13 : BuildType({
    name = "build13"

    vcs {
        root(Proj13.vcsRoots.Proj13_Root13)
    }
})
