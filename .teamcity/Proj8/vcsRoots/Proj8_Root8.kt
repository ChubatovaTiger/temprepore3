package Proj8.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object Proj8_Root8 : GitVcsRoot({
    name = "root8"
    pollInterval = 2
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
