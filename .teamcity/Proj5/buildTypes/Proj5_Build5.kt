package Proj5.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj5_Build5 : BuildType({
    name = "build5"

    vcs {
        root(Proj5.vcsRoots.Proj5_Root5)
    }
})
