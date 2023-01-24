package Proj9.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj9_Build9 : BuildType({
    name = "build9"

    vcs {
        root(Proj9.vcsRoots.Proj9_Root9)
    }
})
