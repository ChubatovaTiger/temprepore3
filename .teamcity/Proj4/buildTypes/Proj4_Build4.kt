package Proj4.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj4_Build4 : BuildType({
    name = "build4"

    vcs {
        root(Proj4.vcsRoots.Proj4_Root4)
    }
})
