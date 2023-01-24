package Proj10.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj10_Build10 : BuildType({
    name = "build10"

    vcs {
        root(Proj10.vcsRoots.Proj10_Root10)
    }
})
