package Proj11.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Proj11_Build11 : BuildType({
    name = "build11"

    vcs {
        root(Proj11.vcsRoots.Proj11_Root11)
    }
})
