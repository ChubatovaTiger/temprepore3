package Proj5.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object Proj5_Root5 : GitVcsRoot({
    name = "root5"
    pollInterval = 2
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
