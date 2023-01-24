package Proj7.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj7_Build7 : BuildType({
    name = "build7"

    vcs {
        root(Proj7.vcsRoots.Proj7_Root7)
    }
})
