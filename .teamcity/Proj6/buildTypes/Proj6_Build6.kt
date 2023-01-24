package Proj6.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj6_Build6 : BuildType({
    name = "build6"

    vcs {
        root(Proj6.vcsRoots.Proj6_Root6)
    }
})
