package Proj14.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object Proj14_Root14 : GitVcsRoot({
    name = "root14"
    pollInterval = 2
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
