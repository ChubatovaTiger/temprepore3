package Proj15.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj15_Build15 : BuildType({
    name = "build15"

    vcs {
        root(Proj15.vcsRoots.Proj15_Root15)
    }
})
