package Proj8.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj8_Build8 : BuildType({
    name = "build8"

    vcs {
        root(Proj8.vcsRoots.Proj8_Root8)
    }
})
