package Proj1.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj1_Build1 : BuildType({
    name = "build1"

    vcs {
        root(Proj1.vcsRoots.Proj1_Root1)
    }
})
